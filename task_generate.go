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
	SwaggerFilePath       string // path/to/swagger.[yaml|yml]
	ConfigFilePath        string // path/to/config.json
	OutputDirectory       string // 出力先ディレクトリ
	SwaggerCodegenVersion string // 出力対象バージョン
	TargetLanguage        string // 対象言語
	ctx                   *cli.Context
}

func newSwaggerCodegenTask(ctx *cli.Context) (*SwaggerCodegenTask, error) {
	task := &SwaggerCodegenTask{
		ctx: ctx,
	}

	if version := ctx.String("codegen-version"); version == "" {
		// デフォルトバージョンを使用する
		task.SwaggerCodegenVersion = SWAGGER_CODEGEN_VERSION
	} else {
		// 指定バージョンを使用する
		task.SwaggerCodegenVersion = version
	}

	if config := ctx.String("config"); config == "" {
		return nil, errors.New("-config not set")
	} else {
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

	// copy configs
	if config, err := ioutil.ReadFile(it.ConfigFilePath); err != nil {
		fmt.Errorf("%v load failed\n", it.ConfigFilePath)
		return
	} else {
		ioutil.WriteFile(GetTempFilePath("config.json"), config, os.ModePerm)
	}

	if config, err := ioutil.ReadFile(it.SwaggerFilePath); err != nil {
		fmt.Errorf("%v load failed\n", it.ConfigFilePath)
		return
	} else {
		yamlValue := string(config)
		yamlValue = strings.Replace(yamlValue,
			"__GENERATED_DATE__",
			time.Now().Format("2006-01-02 15:04:05"),
			-1)
		ioutil.WriteFile(GetTempFilePath("swagger.yaml"), []byte(yamlValue), os.ModePerm)
	}

	shell := &Shell{
		Commands: []string{
			"docker", "run", "--rm",
			"-v", GetDockerMountPath() + "/.swagger/temp:/work",
			"-w", "/work",
			"eaglesakura/swagger-codegen:" + it.SwaggerCodegenVersion,
			"groovy", "/usr/local/bin/generate.groovy",
			it.TargetLanguage,
		},
	}

	// Docker 実行
	shell.Stdout = func(stdout string) {
		fmt.Println(stdout)
	}
	shell.Stderr = func(stderr string) {
		fmt.Println(stderr)
	}

	err := shell.Run()
	if err != nil {
		fmt.Errorf("%v", err)
		return
	}

	// ディレクトリを移動させる
	os.RemoveAll(it.OutputDirectory)
	os.MkdirAll(it.OutputDirectory, os.ModePerm)
	os.Rename(GetTempFilePath("build/"+it.TargetLanguage), it.OutputDirectory+"/"+it.TargetLanguage)
	os.Rename(GetTempFilePath("build/swagger.json"), it.OutputDirectory+"/swagger.json")
}
