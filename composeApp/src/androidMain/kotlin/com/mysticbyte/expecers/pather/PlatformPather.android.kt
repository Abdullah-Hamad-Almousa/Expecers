package com.mysticbyte.expecers.pather

import android.content.Context
import android.os.Build
import androidx.core.content.getSystemService

actual object PlatformPather {

    private lateinit var appContext: Context

    fun initAndroidPather(context: Context){
        appContext = context.applicationContext
    }

    actual val cacheDir: String by lazy { appContext.cacheDir.absolutePath }
    actual val tempDir: String by lazy { appContext.cacheDir.absolutePath }
}