package com.example.testproj.presentation.ui.fragment

import com.example.testproj.base.BaseViewModel
import com.example.testproj.base.Resource
import com.example.testproj.domain.FilmUseCase
import com.example.testproj.presentation.modelUI.FilmUI
import com.example.testproj.presentation.modelUI.toUI
import com.example.testproj.presentation.state.UIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class FilmViewModel @Inject constructor(
    private val repository: FilmUseCase
) : BaseViewModel() {

    private val _filmsState =
        MutableStateFlow<UIState<Resource<List<FilmUI>>>>(UIState.Loading())
    var filmsState: StateFlow<UIState<Resource<List<FilmUI>>>> = _filmsState.asStateFlow()

    private val _filmState =
        MutableStateFlow<UIState<FilmUI>>(UIState.Loading())
    var filmState: StateFlow<UIState<FilmUI>> = _filmState.asStateFlow()

    init {
        fetchFilms()
    }

    private fun fetchFilms() {
        repository().collectRequest(_filmsState) { it!!.map { data -> data.toUI() } }
    }

    fun fetchFilm(id: String) {
        repository(id).collectRequest(_filmState) { it.toUI() }
    }
}