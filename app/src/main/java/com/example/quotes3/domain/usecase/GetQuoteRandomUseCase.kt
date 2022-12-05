package com.example.quotes3.domain.usecase

import com.example.quotes3.domain.QuoteRepository
import com.example.quotes3.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteRandomUseCase @Inject constructor(
    private val quoteRepository: QuoteRepository
) {
    suspend fun getQuoteRandom(): Flow<QuoteModel> = quoteRepository.getQuoteRandom()

}
