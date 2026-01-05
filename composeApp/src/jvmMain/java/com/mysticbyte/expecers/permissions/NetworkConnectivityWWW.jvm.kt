package com.mysticbyte.expecers.permissions

import jdk.jfr.internal.OldObjectSample.emit
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.distinctUntilChanged
import java.net.InetSocketAddress
import java.net.Socket

actual class NetworkConnectivityWWW {
    actual fun isOnline(): Boolean {

        return try {

            val timeoutMs = 1500
            val socket = Socket()

            socket.connect(InetSocketAddress("8.8.8.8", 53), timeoutMs)
            socket.close()
            true
        } catch (e: Exception) {
            false
        }

    }

    actual fun observeConnected(): Flow<Boolean> = flow {

        while (true) {

            emit(isOnline())
            delay(5000)

        }

    }.distinctUntilChanged()

}