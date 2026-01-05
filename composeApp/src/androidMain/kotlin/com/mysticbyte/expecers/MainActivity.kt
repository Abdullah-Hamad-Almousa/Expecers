package com.mysticbyte.expecers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mysticbyte.expecers.pather.PlatformPather.initAndroidPather
import com.mysticbyte.expecers.permissions.NetworkConnectivityWWW

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        initAndroidPather(this)
        setContent {
            App(
                networkConnectivityWWW = NetworkConnectivityWWW(this)
            )
        }
    }
}