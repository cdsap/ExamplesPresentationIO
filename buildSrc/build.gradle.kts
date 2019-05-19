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
    implementation("com.android.tools.build:gradle:3.4.0")
    implementation("com.cdsap:talaiot:0.2.0")
}

gradlePlugin {
    plugins {
        register("LibraryCommonPlugin") {
            id = "libraryCommonPlugin"
            implementationClass = "com.plugin.LibraryCommonPlugin"
        }
    }
}