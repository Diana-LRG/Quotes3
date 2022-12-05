package com.example.quotes3.core.di

import com.example.quotes3.data.UserRepositoryImpl
import com.example.quotes3.data.remote.UserRemoteDataSource
import com.example.quotes3.data.remote.UserRemoteDataSourceImpl
import com.example.quotes3.domain.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UserRepositoryModule {

    @Binds
    abstract fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl):
            UserRepository

    @Binds
    abstract fun bindUserRemoteDataSource(userRemoteDataSourceImpl: UserRemoteDataSourceImpl):
            UserRemoteDataSource


}