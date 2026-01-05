package com.mysticbyte.expecers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.mysticbyte.expecers.exp.CurrentTime
import com.mysticbyte.expecers.exp.DeviceInfo
import com.mysticbyte.expecers.pather.PlatformPather
import com.mysticbyte.expecers.permissions.NetworkConnectivityWWW

@Composable
fun App(networkConnectivityWWW: NetworkConnectivityWWW) {

    // Device Info
    var platformInfo = DeviceInfo.platform
    var modelInfo = DeviceInfo.model
    var osVersionInfo = DeviceInfo.osVersion

    // Date and Time
    var currentTime = CurrentTime()

    // Cache and Temp
    var cachePathDir = PlatformPather.cacheDir
    var tempPathDir = PlatformPather.tempDir

    // Network Connectivity
    val isOnline by networkConnectivityWWW.observeConnected().collectAsState(initial = networkConnectivityWWW.isOnline())

    // Clipboard
    val clipboardManager = LocalClipboardManager.current

    // URL / Sharing
    val uriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF232323))
    ){

        Column(
            modifier = Modifier
                .padding(17.dp)
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Log Message
            Button(
                onClick = {
                    logMessage("KMP", "Log Message")
                }
            ){
                Text("Click For A Log Message")
            }
            // Log Message

            Spacer(modifier = Modifier.padding(7.dp))
            // Device Info
            Text(
                "Platform: |$platformInfo| \n model: |$modelInfo| \n OSVersion: |$osVersionInfo|",
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(13.dp)
                    )
                    .background(Color(0xFF797979))
                    .padding(7.dp)
            )
            // Device Info

            Spacer(modifier = Modifier.padding(7.dp))

            // Date Time
            Text(
                currentTime,
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(13.dp)
                    )
                    .background(Color(0xFF797979))
                    .padding(7.dp)
            )
            // Date Time

            Spacer(modifier = Modifier.padding(7.dp))

            // Cache and Temp
            Text(
                "Cache: |$cachePathDir| \n Temp: |$tempPathDir|",
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(13.dp)
                    )
                    .background(Color(0xFF797979))
                    .padding(7.dp)
            )
            // Cache and Temp

            Spacer(modifier = Modifier.padding(7.dp))

            // Status for network connectivity
            Text(
                text = if (isOnline) "Status: Online" else "Status: Offline",
                color = if (isOnline) Color.Green else Color.Red
            )
            // Status for network connectivity

            Spacer(modifier = Modifier.padding(7.dp))

            // Copy to Clipboard
            Button(onClick = {
                clipboardManager.setText(AnnotatedString("Clipboard Worked!"))
            }) {
                Text("Copy to Clipboard")
            }
            // Copy to Clipboard

            Spacer(modifier = Modifier.padding(7.dp))

            // URL / Sharing
            Button(onClick = {
                uriHandler.openUri("https://my-resume-kappa-one.vercel.app/")
            }) {
                Text("Open Website")
            }
            // URL / Sharing

        }

    }

}