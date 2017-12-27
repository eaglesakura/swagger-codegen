package main

import (
	"io/ioutil"
	"os"
	"runtime"
	"strings"
)

/*
 一時ファイルの格納パスを取得する
*/
func GetTempFilePath(path string) string {
	return ".swagger/temp/" + path
}

/*
 一時ファイル格納パスを生成する
*/
func NewTempFileDirectory() {
	DeleteTempFiles()
	os.MkdirAll(".swagger/temp", os.ModePerm)
	ioutil.WriteFile(".swagger/temp/.gitignore", []byte(`
*.bin
*.json
*.yaml
*.dat
*.db
*.go
*.java
*.cs
`), os.ModePerm)

}

/*
 一時ファイルを削除する
*/
func DeleteTempFiles() {
	os.RemoveAll(".swagger")
}

/*
カレントディレクトリのDockerマウント用パスを取得する
*/
func GetDockerMountPath() string {
	currentDir, _ := os.Getwd()

	if runtime.GOOS == "windows" {
		if currentDir[0:1] != "/" {
			currentDir = "/" + strings.ToLower(currentDir[0:1]) + currentDir[1:]
		}
		currentDir = strings.Replace(currentDir, ":\\", "/", -1)
		currentDir = strings.Replace(currentDir, "\\", "/", -1)
	}

	return currentDir
}
