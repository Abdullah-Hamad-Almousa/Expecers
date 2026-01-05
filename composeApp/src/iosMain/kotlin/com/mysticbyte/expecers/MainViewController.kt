package com.mysticbyte.expecers

import androidx.compose.ui.window.ComposeUIViewController
import com.mysticbyte.expecers.permissions.NetworkConnectivityWWW

fun MainViewController() = ComposeUIViewController { App(
    networkConnectivityWWW = NetworkConnectivityWWW()
) }