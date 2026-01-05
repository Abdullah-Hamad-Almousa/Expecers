package com.mysticbyte.expecers

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.mysticbyte.expecers.permissions.NetworkConnectivityWWW

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Expecers",
    ) {
        App(
            networkConnectivityWWW = NetworkConnectivityWWW()
        )
    }
}