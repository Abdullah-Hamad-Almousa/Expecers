package com.mysticbyte.expecers.exp

import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSURL
import platform.UIKit.UIActivityViewController
import platform.UIKit.UIApplication
import platform.UIKit.popoverPresentationController

actual class PlatformUtils {

    actual fun openUrl(url: String) {

        val nsUrl = NSURL.URLWithString(url) ?: return

        UIApplication.sharedApplication.openURL(nsUrl, options = mapOf<Any?, Any?>(), completionHandler = null)

    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun shareText(text: String) {

        val window = UIApplication.sharedApplication.keyWindow
        val rootViewController = window?.rootViewController ?: return

        val activityViewController = UIActivityViewController(
            activityItems = listOf(text),
            applicationActivities = null
        )

        activityViewController.popoverPresentationController?.apply {

            sourceView = rootViewController.view
            sourceRect = rootViewController.view.bounds

        }

        rootViewController.presentViewController(activityViewController,
            true, null)

    }

}

actual fun createPlatformUtils() = PlatformUtils()