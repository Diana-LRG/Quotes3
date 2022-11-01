package com.example.quotes3.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quotes3.domain.model.QuoteModel
import com.example.quotes3.domain.usecase.GetQuoteAddUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteAddViewModel
@Inject constructor(private val getQuoteAddUseCase: GetQuoteAddUseCase
): ViewModel() {

    fun addQuote(quoteModel: QuoteModel) {
        viewModelScope.launch {
            getQuoteAddUseCase.addQuote(quoteModel)
        }
    }
}