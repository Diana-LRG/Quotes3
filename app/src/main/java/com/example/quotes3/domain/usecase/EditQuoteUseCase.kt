package com.example.quotes3.domain.usecase

import com.example.quotes3.domain.QuoteRepository
import com.example.quotes3.domain.model.QuoteModel
import javax.inject.Inject

class EditQuoteUseCase @Inject constructor(private val quoteRepository: QuoteRepository) {
    suspend fun editQuote(quoteModel: QuoteModel) =
        quoteRepository.editQuote(quoteModel)

}
