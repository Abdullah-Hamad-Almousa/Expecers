package com.mysticbyte.expecers.pather

actual object PlatformPather {
    actual val cacheDir: String by lazy {
        System.getProperty("java.io.tmpdir") // JVM doesn't have a native equivalent
    }
    actual val tempDir: String by lazy {
        System.getProperty("java.io.tmpdir")
    }
}