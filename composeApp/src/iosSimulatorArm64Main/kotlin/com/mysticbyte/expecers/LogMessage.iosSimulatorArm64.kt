package com.mysticbyte.expecers

import platform.Foundation.NSLog

actual fun logMessage(tag: String, msg: String) {

    NSLog("$tag: $msg")

}