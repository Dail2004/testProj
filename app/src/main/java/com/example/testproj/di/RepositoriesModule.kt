package com.example.testproj.di

import com.example.testproj.data.repository.FilmRepositoryImpl
import com.example.testproj.domain.FilmRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {


    @Binds
    abstract fun bindFilmsRepository(repositoryImpl: FilmRepositoryImpl): FilmRepository
}