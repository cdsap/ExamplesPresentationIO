package com.task

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.OutputDirectory

abstract class TaskProducer : DefaultTask() {
    @get:OutputDirectory
    abstract val output : DirectoryProperty
}