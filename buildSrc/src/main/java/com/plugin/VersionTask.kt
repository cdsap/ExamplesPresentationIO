package com.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

abstract class VersionTask : DefaultTask() {
    @get:Input
    abstract val versionName: Property<String>
}