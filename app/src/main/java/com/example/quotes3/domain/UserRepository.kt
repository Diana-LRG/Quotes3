package com.example.quotes3.domain

import com.example.quotes3.data.model.LoginRequest
import com.example.quotes3.data.remote.UserLoginResponse
import kotlinx.coroutines.flow.Flow

interface  UserRepository {
    suspend fun login(loginRequest: LoginRequest): Flow<UserLoginResponse>?

}