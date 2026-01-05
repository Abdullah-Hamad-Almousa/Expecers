package com.mysticbyte.expecers.clipb

expect class ClipboardManager {

    fun setText(text: String)
    fun getText(): String?

}

expect fun createClipboardManager(): ClipboardManager