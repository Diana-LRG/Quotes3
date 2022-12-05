package com.example.quotes3.data.remote

import com.example.quotes3.data.model.LoginRequest
import kotlinx.coroutines.flow.Flow

interface UserRemoteDataSource {
    suspend fun login(loginRequest: LoginRequest): Flow<UserLoginResponse>
}