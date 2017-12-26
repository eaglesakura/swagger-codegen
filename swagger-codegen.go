package main

import (
	"github.com/urfave/cli"
	"os"
	"fmt"
)

const SWAGGER_CODEGEN_VERSION = "1.0.52"

func main() {
	NewTempFileDirectory()
	defer func() {
		DeleteTempFiles()
	}()

	app := cli.NewApp()
	app.Name = "lightweight-swagger-codegen"
	app.Usage = "swagger code generator"
	app.Version = "0.0 / lightweight-swagger-codegen " + SWAGGER_CODEGEN_VERSION // lightweight-swagger-codegenバージョンに合わせる

	app.Flags = []cli.Flag{
		cli.StringFlag{
			Name:  "codegen-version",
			Usage: "lightweight-swagger-codegen version, default = " + SWAGGER_CODEGEN_VERSION,
		},
	}
	app.Commands = []cli.Command{
		{
			Name: "init",
			Action: func(ctx *cli.Context) {
				if task, err := newInitTask(ctx); err != nil {
					fmt.Errorf("%v\n", err)
				} else {
					task.Execute()
				}
			},
		},
		{
			Name: "generate",
			Action: func(ctx *cli.Context) {
				if task, err := newSwaggerCodegenTask(ctx); err != nil {
					fmt.Errorf("%v\n", err)
				} else {
					task.Execute()
				}
			},
			Flags: []cli.Flag{
				cli.StringFlag{
					Name:  "config",
					Usage: "path/to/config.json",
				},
				cli.StringFlag{
					Name:  "swagger",
					Usage: "path/to/swagger.yaml",
				},
				cli.StringFlag{
					Name:  "output",
					Usage: "path/to/output/directory",
				},
				cli.StringFlag{
					Name:  "target",
					Usage: "go-client | go-server | android | swagger-json",
				},
			},
		},
	}

	app.Run(os.Args)
}
