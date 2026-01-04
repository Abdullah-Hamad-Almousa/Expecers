package com.mysticbyte.expecers.pather

import platform.Foundation.NSCachesDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSTemporaryDirectory
import platform.Foundation.NSURL
import platform.Foundation.NSUserDomainMask

actual object PlatformPather {
    actual val cacheDir: String by lazy {
        val fileManager = NSFileManager.defaultManager
        val urls = fileManager.URLsForDirectory(NSCachesDirectory, NSUserDomainMask)
        val cacheUrl = urls.firstOrNull() as? NSURL
        cacheUrl?.path ?: "/var/tmp" //fallback
    }
    actual val tempDir: String by lazy {
        NSTemporaryDirectory()
    }
}