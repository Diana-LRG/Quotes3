package com.example.quotes3.data.local

import com.example.quotes3.data.remote.QuoteApiResponse
import com.example.quotes3.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow

interface QuoteLocalDataSource {
    suspend fun  getQuotes(): Flow<QuoteApiResponse>
    fun  getQuote(quoteId:Int): Flow<QuoteModel>
    fun  getQuoteRandom(): Flow<QuoteModel>

    suspend fun  insertAll(quotes : List<QuoteModel>)
    suspend fun  insert(quoteModel: QuoteModel )
    suspend fun  editQuote(quoteModel: QuoteModel)
}