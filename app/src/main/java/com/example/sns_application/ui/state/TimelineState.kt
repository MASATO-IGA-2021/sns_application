package com.example.sns_application.ui.state

import com.example.sns_application.data.entity.Post

data class TimelineState(
    val timelines: List<Post> = emptyList(),
    val isLoading: Boolean = false

)
