package com.example.quotes3.core.di

import com.example.quotes3.data.QuoteRepositoryImpl
import com.example.quotes3.data.local.QuoteLocalDataSource
import com.example.quotes3.data.local.QuoteLocalDataSourceImpl
import com.example.quotes3.domain.QuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteRepositoryModule {

    @Binds
    abstract fun bindQuoteRepository(quoteRepositoryImpl: QuoteRepositoryImpl):
            QuoteRepository

    @Binds
    abstract fun bindQuoteLocalDataSource(quoteLocalDataSourceImpl: QuoteLocalDataSourceImpl):
            QuoteLocalDataSource

}