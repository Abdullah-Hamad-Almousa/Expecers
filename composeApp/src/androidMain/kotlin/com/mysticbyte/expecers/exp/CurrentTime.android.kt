package com.mysticbyte.expecers.exp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.ZoneId

@RequiresApi(Build.VERSION_CODES.O)
actual fun CurrentTime(): String {
    return LocalDateTime.now(ZoneId.systemDefault()).toString()
}