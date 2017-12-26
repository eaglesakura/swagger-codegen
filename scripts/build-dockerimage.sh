#! /bin/bash -eu

CODEGEN_VERSION=$1

docker \
    build \
    --build-arg SWAGGER_CODEGEN_VERSION=$CODEGEN_VERSION \
    -t eaglesakura/swagger-codegen:$CODEGEN_VERSION \
    ./docker
