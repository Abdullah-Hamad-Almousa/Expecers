package com.mysticbyte.expecers.clipb

import android.content.Context

import android.content.ClipboardManager
import android.content.ClipData

private lateinit var appContext: Context

fun initClipboard(context: Context){

    appContext = context.applicationContext

}

actual object ClipboardManager {
    actual fun setText(text: String) {
        checkInitialized()
    }

    actual fun getText(): String? {
        TODO("Not yet implemented")
    }
}