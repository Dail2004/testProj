package com.example.testproj.presentation.modelUI

import com.example.testproj.domain.FilmModel

data class FilmUI(
    val description: String,
    val director: String,
    val id: String,
    val locations: List<String>,
    val originalTitle: String,
    val originalTitleRomanised: String,
    val people: List<String>,
    val producer: String,
    val releaseDate: String,
    val rtScore: String,
    val runningTime: String,
    val species: List<String>,
    val title: String,
    val url: String,
    val vehicles: List<String>
)

fun FilmModel.toUI() = FilmUI(
    description,
    director,
    id,
    locations,
    originalTitle,
    originalTitleRomanised,
    people,
    producer,
    releaseDate,
    rtScore,
    runningTime,
    species,
    title,
    url,
    vehicles
)