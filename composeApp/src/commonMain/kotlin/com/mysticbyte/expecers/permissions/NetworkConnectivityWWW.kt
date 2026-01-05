package com.mysticbyte.expecers.permissions

import kotlinx.coroutines.flow.Flow

expect class NetworkConnectivityWWW {

    fun isOnline(): Boolean
    fun observeConnected(): Flow<Boolean>

}