package com.mysticbyte.expecers.clipb

import platform.UIKit.UIPasteboard

actual class ClipboardManager {
    actual fun setText(text: String) {

        UIPasteboard.generalPasteboard.string = text

    }

    actual fun getText(): String? {
        return UIPasteboard.generalPasteboard.string
    }
}