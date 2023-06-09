package com.example.testproj.domain

data class FilmModel(
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