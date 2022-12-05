package com.example.quotes3.core.di

import com.example.quotes3.data.PreferenceStorageImpl
import com.example.quotes3.domain.PreferenceStorage
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class PreferenceModule {
    @Binds
    abstract fun bindPreferenceStorage(preferenceStorageImpl: PreferenceStorageImpl):
            PreferenceStorage
}
