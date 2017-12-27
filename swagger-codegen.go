package main

import (
	"github.com/urfave/cli"
	"os"
	"fmt"
)

const SwaggerCodegenVersion = "1.1.1"

func main() {
	NewTempFileDirectory()
	defer func() {
		DeleteTempFiles()
	}()

	app := cli.NewApp()
	app.Name = "lightweight-swagger-codegen"
	app.Usage = "swagger code generator"
	app.Version = "1.0.1 / lightweight-swagger-codegen " + SwaggerCodegenVersion // lightweight-swagger-codegenバージョンに合わせる

	app.Flags = []cli.Flag{
		cli.StringFlag{
			Name:  "codegen-version",
			Usage: "lightweight-swagger-codegen version, default = " + SwaggerCodegenVersion,
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
					Name:  "swagger",
					Usage: "path/to/swagger.yaml",
				},
				cli.StringFlag{
					Name:  "config",
					Usage: "path/to/config.json",
				},
				cli.StringFlag{
					Name:  "output",
					Usage: "path/to/output/directory",
				},
				cli.StringFlag{
					Name:  "target",
					Usage: "go-client | go-server | android | swagger-json",
				},
				cli.BoolFlag{
					Name:  "with-clean",
					Usage: "[pre generate] remove output directory",
				},
			},
		},
	}

	app.Run(os.Args)
}
