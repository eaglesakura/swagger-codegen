package main

import (
	"github.com/urfave/cli"
	"errors"
	"io/ioutil"
	"fmt"
	"os"
	"strings"
	"time"
)

type SwaggerCodegenTask struct {
	SwaggerFilePath       string            // path/to/swagger.[yaml|yml]
	ConfigFilePath        string            // path/to/config.json
	OutputDirectory       string            // 出力先ディレクトリ
	SwaggerCodegenVersion string            // 出力対象バージョン
	TargetLanguage        string            // 対象言語
	ReplaceDefine         map[string]string // テキスト置換
	ctx                   *cli.Context
}

func newSwaggerCodegenTask(ctx *cli.Context) (*SwaggerCodegenTask, error) {
	task := &SwaggerCodegenTask{
		ctx: ctx,
	}

	if version := ctx.String("codegen-version"); version == "" {
		// デフォルトバージョンを使用する
		task.SwaggerCodegenVersion = SwaggerCodegenVersion
	} else {
		// 指定バージョンを使用する
		task.SwaggerCodegenVersion = version
	}

	if config := ctx.String("config"); config != "" {
		task.ConfigFilePath = config
	}

	if swagger := ctx.String("swagger"); swagger == "" {
		return nil, errors.New("-swagger not set")
	} else {
		task.SwaggerFilePath = swagger
	}

	if output := ctx.String("output"); output == "" {
		return nil, errors.New("-output not set")
	} else {
		task.OutputDirectory = output
	}

	if target := ctx.String("target"); target == "" {
		return nil, errors.New("-target not set")
	} else {
		task.TargetLanguage = target
	}

	fmt.Printf("lightweight-swagger-codegen version[%v]\n", task.SwaggerCodegenVersion)
	return task, nil
}

func (it *SwaggerCodegenTask) Execute() {

	// cleanフラグを持っていたら、既存ディレクトリを削除する
	if it.ctx.Bool("with-clean") {
		fmt.Printf("Clean directory[%v]\n", it.OutputDirectory)
		os.RemoveAll(it.OutputDirectory)
		os.MkdirAll(it.OutputDirectory, os.ModePerm)
	}

	// copy configs
	if it.ConfigFilePath != "" {
		if config, err := ioutil.ReadFile(it.ConfigFilePath); err != nil {
			fmt.Errorf("%v load failed\n", it.ConfigFilePath)
			return
		} else {
			ioutil.WriteFile(GetTempFilePath("config.json"), config, os.ModePerm)
		}
	}

	if config, err := ioutil.ReadFile(it.SwaggerFilePath); err != nil {
		fmt.Errorf("%v load failed\n", it.SwaggerFilePath)
		return
	} else {
		yamlValue := string(config)
		yamlValue = strings.Replace(yamlValue,
			"__GENERATED_DATE__",
			time.Now().Format("2006-01-02 15:04:05"),
			-1)

		// Key=Valueを入れ替える
		for _, keyValue := range it.ctx.StringSlice("define") {
			split := strings.Split(keyValue, "=")
			if len(split) != 2 {
				fmt.Errorf("--define format error [%v] require(key=value)", keyValue)
				return
			} else {
				fmt.Printf("Replace %v=%v\n", split[0], split[1])
			}

			yamlValue = strings.Replace(yamlValue, split[0], split[1], -1)
		}

		ioutil.WriteFile(GetTempFilePath("swagger.yaml"), []byte(yamlValue), os.ModePerm)
	}

	shell := &Shell{
		Commands: []string{
			"docker", "run", "--rm",
			"-v", GetDockerMountPath() + "/.swagger/temp:/work",
			"-v", GetDockerMountPath() + "/" + it.OutputDirectory + ":/output",
			"-w", "/work",
			"eaglesakura/swagger-codegen:" + it.SwaggerCodegenVersion,
			"groovy", "/usr/local/bin/generate.groovy",
			it.TargetLanguage,
		},
	}
	// Docker 実行
	shell.Stdout = func(lineText string) {
		lineText = strings.Replace(lineText, "/output", it.OutputDirectory, -1)
		fmt.Println(lineText)
	}
	shell.Stderr = func(lineText string) {
		lineText = strings.Replace(lineText, "/output", it.OutputDirectory, -1)
		fmt.Println(lineText)
	}

	err := shell.Run()
	if err != nil {
		fmt.Errorf("%v", err)
		return
	}
}
