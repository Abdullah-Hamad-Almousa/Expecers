package com.mysticbyte.expecers.exp

import java.time.LocalDateTime
import java.time.ZoneId

actual fun CurrentTime(): String {
    return LocalDateTime.now(ZoneId.systemDefault()).toString()
}