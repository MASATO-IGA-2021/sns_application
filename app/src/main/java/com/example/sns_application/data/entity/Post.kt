package com.example.sns_application.data.entity

data class Post(
    val id: Int,
    val author: User,
    val content: String
)
