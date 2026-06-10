package com.generated.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    fun onExploreGalleryClick() {
        viewModelScope.launch {
            // Add navigation logic to the gallery screen
        }
    }

    fun updateUiState(homeUiState: HomeUiState) {
        _uiState.update { homeUiState }
    }
}

data class HomeUiState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String? = null
)