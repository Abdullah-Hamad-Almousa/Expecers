package com.mysticbyte.expecers.exp

expect class PlatformUtils {

    fun openUrl(url: String)
    fun shareText(text: String)

}

expect fun createPlatformUtils(): PlatformUtils