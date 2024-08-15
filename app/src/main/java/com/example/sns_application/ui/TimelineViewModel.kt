package com.example.sns_application.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sns_application.data.repository.DefaultTimelineRepository
import com.example.sns_application.data.repository.TimelineRepository
import com.example.sns_application.ui.state.TimelineState
import kotlinx.coroutines.launch

class TimelineViewModel(
    private val timelineRepository: TimelineRepository = DefaultTimelineRepository()
):ViewModel() {
    var uiState by mutableStateOf(TimelineState())

    suspend fun getTimelines() {
        viewModelScope.launch {
            uiState = uiState.copy(isLoading = true)
            val timelines = timelineRepository.getTimelines()
            uiState = uiState.copy(timelines = timelines, isLoading = false)
        }
    }


}