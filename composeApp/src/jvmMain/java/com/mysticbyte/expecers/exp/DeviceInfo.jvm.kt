package com.mysticbyte.expecers.exp

actual class DeviceInfo {
    actual val platform: String = System.getProperty("java.version")
    actual val model: String = System.getProperty("os.arch")
    actual val osVersion: String = System.getProperty("os.version")
}