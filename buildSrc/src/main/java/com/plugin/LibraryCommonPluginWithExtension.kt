package com.plugin

import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class LibraryCommonPluginWithExtension : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("com.android.library")
        val pluginWithExtension =
                target.extensions.create("commonLibrary", LibraryCommonExtension::class.java, target)
        target.plugins.all {
            when (this) {
                is LibraryPlugin -> {
                    val extension = target.extensions.getByType<LibraryExtension>()
                    extension.configure()
                    target.afterEvaluate {
                        extension.defaultConfig.versionName = pluginWithExtension.versionName.get()
                    }
                }
            }
        }
    }
}