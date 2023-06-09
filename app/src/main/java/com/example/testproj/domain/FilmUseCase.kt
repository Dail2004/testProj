package com.example.testproj.domain

import javax.inject.Inject

class FilmUseCase @Inject constructor(
    private val repository: FilmRepository
) {
    operator fun invoke() = repository.fetchFilms()

    operator fun invoke(id: String) = repository.fetchFilm(id)
}