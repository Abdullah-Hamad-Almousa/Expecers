package com.mysticbyte.expecers.exp

import platform.Foundation.NSProcessInfo
import platform.UIKit.UIDevice.Companion.currentDevice

actual class DeviceInfo {
    actual val platform: String = "IOS"
    actual val model: String = currentDevice.model
    actual val osVersion: String = NSProcessInfo.processInfo.operatingSystemVersionString
}