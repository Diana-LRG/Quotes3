package com.example.quotes3.domain.usecase

import com.example.quotes3.data.remote.QuoteApiResponse
import com.example.quotes3.domain.QuoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val quoteRepository: QuoteRepository) {
    suspend fun getQuotes(token: String): Flow<QuoteApiResponse?> = quoteRepository.getQuotes(token)

}