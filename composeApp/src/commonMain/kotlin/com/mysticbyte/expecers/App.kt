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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mysticbyte.expecers.exp.CurrentTime
import com.mysticbyte.expecers.exp.DeviceInfo

@Composable
fun App() {

    var platformInfo = DeviceInfo.platform
    var modelInfo = DeviceInfo.model
    var osVersionInfo = DeviceInfo.osVersion

    var currentTime = CurrentTime()

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

            Button(
                onClick = {
                    logMessage("KMP", "Log Message")
                }
            ){
                Text("Click For A Log Message")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Text(
                "Platform: |$platformInfo| \n model: |$modelInfo| \n OSVersion: |$osVersionInfo|",
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(13.dp)
                    )
                    .background(Color(0xFF797979))
                    .padding(7.dp)
            )

            Spacer(modifier = Modifier.padding(7.dp))

            Text(
                currentTime,
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(13.dp)
                    )
                    .background(Color(0xFF797979))
                    .padding(7.dp)
            )

        }

    }

}