package com.example.testproj.data.remote.apiservice

import com.example.testproj.data.remote.dto.FilmDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

interface FilmsApiService {

    @GET("/films")
    suspend fun fetchFilms(): Response<List<FilmDto>>

    @GET("/films/{id}")
    suspend fun fetchFilm(@Path("id") id: String): Response<FilmDto>
}