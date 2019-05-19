package com.worker

import org.apache.commons.codec.digest.DigestUtils
import org.apache.commons.io.FileUtils

import java.io.File
import java.io.FileInputStream
import javax.inject.Inject


class GenerateMD5 @Inject constructor(
        private val sourceFile: File,
        private val md5File: File)
    : Runnable {
    override fun run() {
        try {
            val stream = FileInputStream(sourceFile)
            Thread.sleep(3000)
            FileUtils.writeStringToFile(md5File, DigestUtils.md5Hex(stream), null as String?)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}