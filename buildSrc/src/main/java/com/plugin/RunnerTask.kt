package com.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

abstract class RunnerTask : DefaultTask() {
    @get:Input
    abstract val kkk: Property<String>
}