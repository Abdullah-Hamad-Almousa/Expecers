package com.mysticbyte.expecers

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform