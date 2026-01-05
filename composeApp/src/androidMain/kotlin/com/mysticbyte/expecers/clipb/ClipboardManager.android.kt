package com.mysticbyte.expecers.clipb

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context

actual class ClipboardManager(private val context: Context) {

    private val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

    actual fun setText(text: String) {
        val clip = ClipData.newPlainText("label", text)
        clipboard.setPrimaryClip(clip)
    }

    actual fun getText(): String? {
        return clipboard.primaryClip?.getItemAt(0)?.text?.toString()
    }
}