package com.example.quotes3.domain.usecase

import com.example.quotes3.data.model.LoginRequest
import com.example.quotes3.data.remote.UserLoginResponse
import com.example.quotes3.domain.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUserUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend fun login(loginRequest: LoginRequest): Flow<UserLoginResponse>? = userRepository.login(loginRequest)
}
