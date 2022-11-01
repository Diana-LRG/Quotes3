package com.example.quotes3.data

import com.example.quotes3.data.local.QuoteLocalDataSource
import com.example.quotes3.domain.QuoteRepository
import com.example.quotes3.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteRepositoryImpl @Inject constructor
    (private val localDataSource: QuoteLocalDataSource):
    QuoteRepository {

    override suspend fun getQuoteRandom(): Flow<QuoteModel> {
        return localDataSource.getQuoteRandom()
    }

    override suspend fun getQuote(quoteId: Int): Flow<QuoteModel> {
        return localDataSource.getQuote(quoteId)
    }
}