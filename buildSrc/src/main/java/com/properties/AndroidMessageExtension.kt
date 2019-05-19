package com.properties

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.property

open class AndroidMessageExtension(objects: ObjectFactory) {
    val message: Property<String> = objects.property()
}