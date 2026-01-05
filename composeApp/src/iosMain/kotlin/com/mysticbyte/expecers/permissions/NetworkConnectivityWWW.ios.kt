package com.mysticbyte.expecers.permissions

import platform.Network.nw_path_get_status
import platform.Network.nw_path_monitor_create
import platform.Network.nw_path_monitor_set_queue
import platform.Network.nw_path_monitor_set_update_handler
import platform.Network.nw_path_monitor_start
import platform.Network.nw_path_monitor_cancel
import platform.Network.nw_path_status_satisfied
import platform.darwin.dispatch_get_main_queue
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.distinctUntilChanged

actual class NetworkConnectivityWWW {
    actual fun isOnline(): Boolean {
        return true
    }

    actual fun observeConnected(): Flow<Boolean> = callbackFlow {

        val monitor = nw_path_monitor_create()
        val queue = dispatch_get_main_queue()

        nw_path_monitor_set_update_handler(monitor) { path ->
            val status = nw_path_get_status(path)
            trySend(status == nw_path_status_satisfied)
        }

        nw_path_monitor_set_queue(monitor, queue)
        nw_path_monitor_start(monitor)

        awaitClose {
            nw_path_monitor_cancel(monitor)
        }

    }.distinctUntilChanged()

}