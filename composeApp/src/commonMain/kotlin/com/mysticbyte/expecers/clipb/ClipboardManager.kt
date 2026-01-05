package com.mysticbyte.expecers.clipb

expect class ClipboardManager {

    fun setText(text: String)
    fun getText(): String?

}