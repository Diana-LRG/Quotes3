package com.example.quotes3.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quotes3.domain.PreferenceStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DataStoreViewModel @Inject constructor(private val preferenceStorage: PreferenceStorage): ViewModel() {

    suspend fun getToken(): String {
        return preferenceStorage.getToken().first()
    }

    fun saveToken(token: String) {
        viewModelScope.launch {
            preferenceStorage.saveToken(token)
        }
    }

}