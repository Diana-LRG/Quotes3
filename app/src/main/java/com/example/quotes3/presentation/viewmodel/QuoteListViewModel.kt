package com.example.quotes3.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quotes3.data.remote.QuoteApiResponse
import com.example.quotes3.domain.model.QuoteModel
import com.example.quotes3.domain.usecase.GetQuotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteListViewModel
@Inject constructor (private val getQuotesUseCase: GetQuotesUseCase
): ViewModel(){
    val quote = QuoteModel(0,"Solo se que no se nada","Socrates")
    private var _quotes = MutableStateFlow(
        QuoteApiResponse(false,"",listOf(
            quote))
    )
    val quotes : StateFlow<QuoteApiResponse> = _quotes

    private val _stateLoading = MutableStateFlow<Boolean>(false)
    val isLoading : StateFlow<Boolean> = _stateLoading

    fun  getQuotes(token: String) {
        _stateLoading.value =true
        viewModelScope.launch(Dispatchers.IO) {
            val quoteResponse = getQuotesUseCase.getQuotes(token).first()
            quoteResponse.let{
                _quotes.value =it!!
                _stateLoading.value =false
            }
        }
    }
}