package com.example.quotes3.domain.usecase

import com.example.quotes3.domain.QuoteRepository
import com.example.quotes3.domain.model.QuoteModel
import javax.inject.Inject

class AddQuoteUseCase @Inject constructor(
    private val quoteRepository: QuoteRepository
) {
    suspend fun addQuote(quoteModel: QuoteModel) =
        quoteRepository.addQuote(quoteModel)
}
