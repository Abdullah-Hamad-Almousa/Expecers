package com.mysticbyte.expecers.viewmodel

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class AndroidDispatchers : DispatcherProviderIO {
    override val main: CoroutineDispatcher = Dispatchers.Main
    override val io: CoroutineDispatcher = Dispatchers.IO
    override val default: CoroutineDispatcher = Dispatchers.Default
}

actual fun provideDispatcher(): DispatcherProviderIO = AndroidDispatchers()