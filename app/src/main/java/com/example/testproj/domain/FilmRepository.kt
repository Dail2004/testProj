package com.example.testproj.domain

import com.example.testproj.base.Resource
import kotlinx.coroutines.flow.Flow

interface FilmRepository {
    fun fetchFilms(): Flow<Resource<List<FilmModel>?>>

    fun fetchFilm(id: String): Flow<Resource<List<FilmModel>?>>
}