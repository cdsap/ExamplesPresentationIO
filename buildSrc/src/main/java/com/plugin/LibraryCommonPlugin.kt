package com.plugin

import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class LibraryCommonPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("com.android.library")
        target.plugins.all {
            when (this) {
                is LibraryPlugin -> {
                    val extension = target.extensions.getByType<LibraryExtension>()
                    extension.configure()
                }
            }
        }
    }
}


fun LibraryExtension.configure() {
    setCompileSdkVersion(28)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.1"
    }
}