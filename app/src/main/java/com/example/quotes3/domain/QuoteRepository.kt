package com.example.quotes3.domain

import com.example.quotes3.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow

interface QuoteRepository {
    // suspend fun getQuotes(): Flow<QuoteResponse?>
    suspend fun getQuoteRandom(): Flow<QuoteModel>
    suspend fun getQuote(quoteId:Int): Flow<QuoteModel>
    //suspend fun editQuote(quoteModel: QuoteModel, token:String): Flow<QuoteResponse?>
    // suspend fun addQuote(quoteModel: QuoteModel, token:String): Flow<QuoteResponse?>
}