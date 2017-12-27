# swagger-codegen

[Swagger](https://swagger.io/) フォーマットのyamlから各言語用ソースコードを出力するためのコマンドラインツールです。

出力するためには別途 [Docker](https://www.docker.com/) のインストールが必要になります。

`swagger-codegen generate` コマンドにより、各種ソースコードを生成します。

[本家SwaggerCodegen](https://github.com/swagger-api/swagger-codegen) に比べ、依存ライブラリの選択自由度が上がっています。

使用するためには別途coreライブラリが必要です

 * [swagger-go-core](https://github.com/eaglesakura/swagger-go-core)
 * [swagger-java-core](https://github.com/eaglesakura/swagger-java-core)

# Install

```
go get -u -f github.com/eaglesakura/swagger-codegen

# Docker image初期化を行う
swagger-codegen init
```

# Edit swagger.yaml

swaggerは下記のコマンド実行後、ブラウザで `http://localhost:8888/` を開くことで編集することができます。

```bash
# 初回はpullとrunする
docker run --name swagger-editor -d -p 8888:8080 swaggerapi/swagger-editor:v2.10.5
```

```bash
# 2度目以降はstartする
docker container start swagger-editor
```

# Support Language

## Golang / Client

Golang クライアントサイド用ソースコードを出力します。
出力されたコードとは別途、クライアントライブラリが必要です。

```bash
# example
swagger-codegen \
  generate \
  --swagger examples/twitter.yaml \
  --config  examples/config.json \
  --output  examples/go-client \
  --target  go-client
```

```bash
cd path/to/golang/app/repository
go get -u -f github.com/eaglesakura/swagger-go-core
```

## Golang / Server

Golang クライアントサイド用ソースコードを出力します。
出力されたコードとは別途、クライアントライブラリが必要です。

```bash
# example
swagger-codegen \
  generate \
  --swagger examples/twitter.yaml \
  --config  examples/config.json \
  --output  examples/go-server \
  --target  go-server
```

```bash
cd path/to/golang/server/repository
go get -u -f github.com/eaglesakura/swagger-go-core
```

## Android / Client

Androidアプリ用ソースコードを出力します。
出力されたコードとは別途、クライアントライブラリが必要です。

```bash
# example
swagger-codegen \
  generate \
  --swagger examples/twitter.yaml \
  --config  examples/config.json \
  --output  examples/android \
  --target  android
```

```gradle
// Android用クライアントライブラリを導入
dependencies { api("com.eaglesakura:swagger-java-core:1.0.10") }
```

## Swagger / json

[Swagger UI](https://swagger.io/swagger-ui/) に渡すためのswagger.jsonを生成します。

```bash
# example
swagger-codegen \
  generate \
  --swagger examples/twitter.yaml \
  --output  examples/swagger-json \
  --target  swagger-json
```

# LICENSE

MIT LICENSE

see [LICENSE.txt](./LICENSE.txt)
