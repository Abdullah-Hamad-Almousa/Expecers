package com.mysticbyte.expecers.viewmodel

import kotlinx.coroutines.CoroutineDispatcher

interface DispatcherProviderIO {

    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher

}

expect fun provideDispatcher(): DispatcherProviderIO