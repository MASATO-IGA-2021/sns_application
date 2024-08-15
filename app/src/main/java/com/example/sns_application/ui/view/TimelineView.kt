package com.example.sns_application.ui.view

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sns_application.ui.TimelineViewModel
import com.example.sns_application.ui.component.organism.Posts
import com.example.sns_application.ui.state.TimelineState

@Composable
fun TimelineView(
    modifier: Modifier = Modifier
) {
    val viewModel: TimelineViewModel = viewModel()
    val uiState = viewModel.uiState

    if (uiState.isLoading) {
        LoadingView(modifier = modifier)
    }else{
        Posts(posts = uiState.timelines, modifier = modifier)
    }

    LaunchedEffect(Unit) {
        viewModel.getTimelines()
        Log.d("First Get Timelines", uiState.timelines.toString())
    }
}