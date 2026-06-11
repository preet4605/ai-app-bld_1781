package com.generated.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ImageDetailsViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ImageDetailsUiState())
    val uiState: StateFlow<ImageDetailsUiState> = _uiState.asStateFlow()

    fun onBackClick() {
        viewModelScope.launch {
            // Add navigation logic to the previous screen
        }
    }

    fun updateUiState(imageDetailsUiState: ImageDetailsUiState) {
        _uiState.update { imageDetailsUiState }
    }
}

data class ImageDetailsUiState(
    val imageResId: Int? = null,
    val imageTitle: String? = null,
    val imageDescription: String? = null,
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String? = null
)