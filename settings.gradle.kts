rootProject.name = "kotlin_lessons"
include("m1l1-hello")

dependencyResolutionManagement {
    versionCatalogs {
        create("lib") {
            from(files("gradle/catalogs/lib.versions.toml"))
        }
    }
}