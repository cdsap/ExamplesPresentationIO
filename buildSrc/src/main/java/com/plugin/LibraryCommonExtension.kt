package com.plugin

import org.gradle.api.Project
import org.gradle.api.provider.Property

abstract class LibraryCommonExtension(project: Project) {
    abstract val versionName: Property<String>
}