package main

import (
	"github.com/urfave/cli"
	"fmt"
)

type InitTask struct {
	SwaggerCodegenVersion string // 出力対象バージョン
	ctx                   *cli.Context
}

func newInitTask(ctx *cli.Context) (*InitTask, error) {
	task := &InitTask{
		ctx: ctx,
	}

	if version := ctx.String("codegen-version"); version == "" {
		// デフォルトバージョンを使用する
		task.SwaggerCodegenVersion = SWAGGER_CODEGEN_VERSION
	} else {
		// 指定バージョンを使用する
		task.SwaggerCodegenVersion = version
	}

	fmt.Printf("lightweight-swagger-codegen version[%v]\n", task.SwaggerCodegenVersion)
	return task, nil
}

func (it *InitTask) Execute() {
	shell := &Shell{
		Commands: []string{
			"docker", "pull",
			"eaglesakura/swagger-codegen:" + it.SwaggerCodegenVersion,
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

}
