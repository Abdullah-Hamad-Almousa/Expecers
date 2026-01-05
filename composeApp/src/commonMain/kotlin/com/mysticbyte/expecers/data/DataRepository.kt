package com.mysticbyte.expecers.data

import com.mysticbyte.expecers.viewmodel.ioDispatcher
import kotlinx.coroutines.withContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataRepository {

    private val scope = CoroutineScope(Dispatchers.Main)

    suspend fun fetchData() {

        scope.launch {

            val result = "client"

        }

    }

}