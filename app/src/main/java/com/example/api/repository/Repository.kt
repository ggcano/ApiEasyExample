package com.example.api.repository

import com.example.api.model.Post
import com.example.api.util.RetrofitInstance
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}