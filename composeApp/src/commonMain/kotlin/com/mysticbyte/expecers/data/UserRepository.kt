package com.mysticbyte.expecers.data

import com.mysticbyte.expecers.viewmodel.DispatcherProviderIO
import com.mysticbyte.expecers.viewmodel.provideDispatcher
import io.ktor.client.HttpClient
import kotlinx.coroutines.withContext

import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText


class UserRepository(
    private val client: HttpClient,
    private val dispatchers: DispatcherProviderIO = provideDispatcher()
) {
    suspend fun getUserData(): String {
        return withContext(context = dispatchers.io) {

            val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts/1")
            // todos/posts
            val rawData = response.bodyAsText()

            val result = processHeavyData(rawData)

            result
        }
    }

    private fun processHeavyData(data: String): String {
        return "Processed: $data"
    }
}