package com.example.quotes3.data.remote

import kotlinx.coroutines.flow.Flow

interface QuoteRemoteDataSource {
    suspend fun getQuotes(token: String): Flow<QuoteApiResponse>
}