package com.properties

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property

open class AndroidMessage : DefaultTask() {
    @Input
    val what: Property<String> = project.objects.property()
    @Internal
    val completeValue: Provider<String> = what.map { " Android $it" }

    @TaskAction
    fun printMessage() {
        logger.quiet(completeValue.get())
    }
}