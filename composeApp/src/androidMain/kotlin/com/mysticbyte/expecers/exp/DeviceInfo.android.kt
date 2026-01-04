package com.mysticbyte.expecers.exp

import android.os.Build

actual class DeviceInfo {
    actual val platform: String = "Android"
    actual val model: String = Build.MODEL
    actual val osVersion: String = Build.VERSION.RELEASE
}