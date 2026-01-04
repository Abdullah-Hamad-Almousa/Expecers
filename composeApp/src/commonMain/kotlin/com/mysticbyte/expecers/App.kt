package com.mysticbyte.expecers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun App() {

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

        }

    }

}