#! /bin/bash -eu

CODEGEN_VERSION=$1

sed -i \
    -e "s/const SwaggerCodegenVersion = .*/const SwaggerCodegenVersion = \"$CODEGEN_VERSION\"/g" \
    swagger-codegen.go

sed -i \
    -e "s/lightweight-swagger-codegen:.*\"/lightweight-swagger-codegen:$CODEGEN_VERSION\"/g" \
    docker/generate.groovy

docker \
    build \
    --build-arg SWAGGER_CODEGEN_VERSION=$CODEGEN_VERSION \
    -t eaglesakura/swagger-codegen:$CODEGEN_VERSION \
    ./docker
