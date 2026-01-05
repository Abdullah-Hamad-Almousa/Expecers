package com.mysticbyte.expecers.clipb

import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection

actual class ClipboardManager {
    actual fun setText(text: String) {

        val selection = StringSelection(text)
        Toolkit.getDefaultToolkit().systemClipboard.setContents(selection, selection)

    }

    actual fun getText(): String? {

        return try {
            Toolkit.getDefaultToolkit().systemClipboard
                .getData(DataFlavor.stringFlavor) as String
        } catch (e: Exception){
            null
        }

    }
}

actual fun createClipboardManager() = ClipboardManager()