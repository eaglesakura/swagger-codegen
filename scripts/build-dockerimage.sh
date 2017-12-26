#! /bin/bash -eu

CODEGEN_VERSION=$1
cat docker/template.groovy \
    | sed -e "s/__CODEGEN_VERSION__/$CODEGEN_VERSION/g" \
    > docker/generate.groovy

#docker \
#    build \
#    --build-arg SWAGGER_CODEGEN_VERSION=$CODEGEN_VERSION \
#    -t eaglesakura/swagger-codegen:$CODEGEN_VERSION \
#    ./docker
