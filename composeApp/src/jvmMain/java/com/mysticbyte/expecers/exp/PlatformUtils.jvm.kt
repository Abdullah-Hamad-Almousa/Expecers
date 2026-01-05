package com.mysticbyte.expecers.exp

import java.awt.Desktop
import java.net.URI
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

actual class PlatformUtils {
    actual fun openUrl(url: String) {

        if (Desktop.isDesktopSupported()){

            Desktop.getDesktop().browse(URI(url))

        }

    }

    actual fun shareText(text: String) {

        val selection = StringSelection(text)
        Toolkit.getDefaultToolkit().systemClipboard.setContents(selection, selection)
        println("Copied to clipboard: $text")

    }

}

actual fun createPlatformUtils() = PlatformUtils()