// groovy 2.9
// groovy ./script/swagger-codegen.groovy

@GrabResolver(name = "eaglesakura", root = "https://dl.bintray.com/eaglesakura/maven/")
@Grab("com.eaglesakura:lightweight-swagger-codegen:__CODEGEN_VERSION__")
import java.lang.Object;

static main(String[] args) {
    // Generate swagger.json
    if(args[0] == "go-client") {
        // generate go client
        com.eaglesakura.swagger.generator.Generator.main([
                "generate",
                "-l", "com.eaglesakura.swagger.generator.GoClientCodegen",
                "-o", "/output",
                "-i", "swagger.yaml",
                "-c", "config.json",
        ] as String[])

        println(["go", "fmt", "/output/..."].execute().text)
    } else if(args[0] == "go-server") {
        // generate go server
        com.eaglesakura.swagger.generator.Generator.main([
                "generate",
                "-l", "com.eaglesakura.swagger.generator.GoServerCodegen",
                "-o", "/output",
                "-i", "swagger.yaml",
                "-c", "config.json",
        ] as String[])

        println(["go", "fmt", "/output/..."].execute().text)
    } else if(args[0] == "android") {
        // Generate Android client binding
        com.eaglesakura.swagger.generator.Generator.main([
                "generate",
                "-l", "com.eaglesakura.swagger.generator.AndroidCodegen",
                "-o", "/output",
                "-i", "swagger.yaml",
                "-c", "config.json",
        ] as String[])
    } else if(args[0] == "swagger-json") {
        // generate swagger.json
        com.eaglesakura.swagger.generator.Generator.main([
                "generate",
                "-l", "io.swagger.codegen.languages.SwaggerGenerator",
                "-o", "/output",
                "-i", "swagger.yaml",
        ] as String[])
    }
}
