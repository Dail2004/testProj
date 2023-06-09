package com.example.testproj.data.repository

import com.example.testproj.base.BaseRepository
import com.example.testproj.base.Resource
import com.example.testproj.data.remote.apiservice.FilmsApiService
import com.example.testproj.data.remote.dto.toDomain
import com.example.testproj.domain.FilmModel
import com.example.testproj.domain.FilmRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FilmRepositoryImpl @Inject constructor(
    private val service: FilmsApiService
) : BaseRepository(), FilmRepository {
    override fun fetchFilms() = doRequest {
        service.fetchFilms().body()?.map { it.toDomain() }
    }

    override fun fetchFilm(id: String) = doRequest {
        service.fetchFilm(id).body()?.toDomain()
    }
}