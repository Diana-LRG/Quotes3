package com.example.quotes3.domain.usecase

import com.example.quotes3.domain.QuoteRepository
import com.example.quotes3.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteAddUseCase @Inject constructor(
    private val quoteRepository: QuoteRepository
){
  //  suspend fun getQuoteRandom(): Flow<QuoteModel> = quoteRepository.getQuoteRandom()
    suspend fun addQuote(quoteModel:QuoteModel)=quoteRepository.addQuote(quoteModel)

}