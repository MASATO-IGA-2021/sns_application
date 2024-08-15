package com.example.sns_application.data.repository

import com.example.sns_application.data.entity.Post

interface TimelineRepository {
    abstract suspend fun getTimelines(): List<Post>
    abstract suspend fun insertPost(): Boolean
    abstract suspend fun deletePost(): Boolean
}

class DefaultTimelineRepository: TimelineRepository {

    override suspend fun getTimelines(): List<Post> {
        TODO("Not yet implemented")
    }

    override suspend fun insertPost(): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deletePost(): Boolean {
        TODO("Not yet implemented")
    }
}