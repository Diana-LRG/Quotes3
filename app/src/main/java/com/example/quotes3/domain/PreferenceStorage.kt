package com.example.quotes3.domain

import kotlinx.coroutines.flow.Flow

interface PreferenceStorage {
    fun getToken() : Flow<String>
    suspend fun saveToken(token: String)

}