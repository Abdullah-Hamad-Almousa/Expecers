package com.mysticbyte.expecers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.mysticbyte.expecers.pather.PlatformPather.initAndroidPather

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        initAndroidPather(this)
        setContent {
            App()
        }
    }
}

@Composable
fun AppAndroidPreview() {
    App()
}