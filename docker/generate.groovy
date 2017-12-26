// groovy 2.9
// groovy ./script/swagger-codegen.groovy

@GrabResolver(name = "eaglesakura", root = "https://dl.bintray.com/eaglesakura/maven/")
@Grab("com.eaglesakura:lightweight-swagger-codegen:1.0.52")
import java.lang.Object;

class AndroidCustomClientCodegen extends com.eaglesakura.swagger.generator.AndroidCustomClientCodegen {
    AndroidCustomClientCodegen() {
        super()
        projectFolder = ""
        sourceFolder = ""
    }
}

static main(String[] args) {
    // Generate swagger.json
    com.eaglesakura.swagger.generator.Generator.main([
            "generate",
            "-l", "io.swagger.codegen.languages.SwaggerGenerator",
            "-o", "build/",
            "-i", "swagger.yaml",
    ] as String[])

    if(args[0] == "go-client") {
        // generate go client
        com.eaglesakura.swagger.generator.Generator.main([
                "generate",
                "-l", "com.eaglesakura.swagger.generator.GoClientCodegen",
                "-o", "build/go-client",
                "-i", "swagger.yaml",
                "-c", "config.json",
        ] as String[])

        println(["go", "fmt", "./build/..."].execute().text)
    } else if(args[0] == "go-server") {
        // generate go server
        com.eaglesakura.swagger.generator.Generator.main([
                "generate",
                "-l", "com.eaglesakura.swagger.generator.GoServerCodegen",
                "-o", "build/go-server",
                "-i", "swagger.yaml",
                "-c", "config.json",
        ] as String[])

        println(["go", "fmt", "./build/..."].execute().text)
    } else if(args[0] == "android") {
        // Generate Android client binding
        com.eaglesakura.swagger.generator.Generator.main([
                "generate",
                "-l", "com.eaglesakura.swagger.generator.AndroidCodegen",
                "-o", "build/android",
                "-i", "swagger.yaml",
                "-c", "config.json",
        ] as String[])
    }
}
