package com.worker

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.SourceTask
import org.gradle.api.tasks.TaskAction
import org.gradle.workers.IsolationMode
import org.gradle.workers.WorkerExecutor
import java.io.File
import javax.inject.Inject

abstract class CreateMD5 @Inject constructor(
        private val workerExecutor: WorkerExecutor
) : SourceTask() {
    @get:OutputDirectory
    abstract val destination: RegularFileProperty

    @TaskAction
    fun createHashes() {
        source.files.forEach {
            val file = File(destination.get().asFile, "$it.md5")
            workerExecutor.submit(GenerateMD5::class.java, {
                isolationMode = IsolationMode.NONE;
                params(it, file)
            })

        }
    }
}