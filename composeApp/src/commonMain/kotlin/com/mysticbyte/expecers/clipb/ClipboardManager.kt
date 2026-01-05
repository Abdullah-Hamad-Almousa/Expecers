package com.mysticbyte.expecers.clipb

expect object ClipboardManager {

    fun setText(text: String)
    fun getText(): String?

}