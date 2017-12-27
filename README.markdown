# swagger-codegen

[Swagger](https://swagger.io/) フォーマットのyamlから各言語用ソースコードを出力するためのコマンドラインツールです。

出力するためには別途 [Docker](https://www.docker.com/) のインストールが必要になります。

`swagger-codegen generate` コマンドにより、各種ソースコードを生成します。

生成されたソースコードは、下記のライブラリに依存しますので組み込み時には `go get` や `build.gradle` への組み込みが必要になります。

 * Golangライブラリ `--target go-client` `--target go-server`
  * `go get -u -f github.com/eaglesakura/swagger-go-core`
 * Androidライブラリ `--target android`
  * `dependencies { api("com.eaglesakura:swagger-java-core:1.0.10") }`

## Install

```
go get -u -f github.com/eaglesakura/swagger-codegen

# Docker image初期化を行う
swagger-codegen init
```

## Edit swagger.yaml

swaggerは下記のコマンド実行後、ブラウザで `http://localhost:8888/` を開くことで編集することができます。

```bash
# 初回はpullとrunする
docker run --name swagger-editor -d -p 8888:8080 swaggerapi/swagger-editor:v2.10.5
```

```bash
# 2度目以降はstartする
docker container start swagger-editor
```

## Support Language

 * Golang
  * クライアントサイド `--target go-client`
  * サーバーサイド `--target go-server`
 * Android(android)
  * クライアントサイド `--target android`
 * swagger.json
  * swagger.yaml to swagger.json `--target swagger-json`

## example

```bash
swagger-codegen \
  generate \
  --swagger examples/twitter.yaml \
  --config  examples/config.json \
  --output  examples/go-client \
  --target  go-client
```

see [LICENSE.txt](./LICENSE.txt)
