package com.mysticbyte.expecers.exp

import platform.Foundation.NSDate
import platform.Foundation.NSDateFormatter
import platform.Foundation.NSTimeZone
import platform.Foundation.systemTimeZone

actual fun CurrentTime(): String {

    val formatter = NSDateFormatter()
    formatter.timeZone = NSTimeZone.systemTimeZone
    formatter.dateFormat = "yyyy-MM-dd HH:mm:ss"
    return formatter.stringFromDate(NSDate())

}