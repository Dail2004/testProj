package com.example.testproj.data.remote.dto

import com.example.testproj.domain.FilmModel
import com.google.gson.annotations.SerializedName

data class FilmDto(
    @SerializedName("description")
    val description: String,
    @SerializedName("director")
    val director: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("locations")
    val locations: List<String>,
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("original_title_romanised")
    val originalTitleRomanised: String,
    @SerializedName("people")
    val people: List<String>,
    @SerializedName("producer")
    val producer: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("rt_score")
    val rtScore: String,
    @SerializedName("running_time")
    val runningTime: String,
    @SerializedName("species")
    val species: List<String>,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("vehicles")
    val vehicles: List<String>
)

fun FilmDto.toDomain() = FilmModel(
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