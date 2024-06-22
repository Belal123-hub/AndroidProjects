package com.example.data.network.profile

import com.example.data.network.profile.model.TopicResponse
import retrofit2.http.GET
import retrofit2.http.Header

interface ProfileApi {
    @GET("v1/topic")
    suspend fun getAllTopics(): List<TopicResponse>
}