plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.31")
    implementation("com.android.tools.build:gradle:3.5.0-beta01")
}

gradlePlugin {
    plugins {
        register("LibraryCommonPlugin") {
            id = "libraryCommonPlugin"
            implementationClass = "com.plugin.LibraryCommonPlugin"
        }
        register("LibraryCommonPluginWithExtension") {
            id = "libraryCommonPluginWithExtension"
            implementationClass = "com.plugin.LibraryCommonPluginWithExtension"
        }
    }
}