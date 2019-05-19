package com.dependencies

object Versions {
    const val kotlin = "1.3.31"
    const val appcompat = "28.0.0"
    const val constraintLayout = "1.1.3"
    const val junit = "4.12"
    const val runner = "1.0.2"
    const val espresso = "3.0.2"
}

object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "com.android.support:appcompat-v7:${Versions.appcompat}"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
    const val junit = "junit:junit:${Versions.junit}"
    const val runner = "com.android.support.test:runner:${Versions.runner}"
    const val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
}