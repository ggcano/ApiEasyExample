package com.example.api.model

import android.icu.text.CaseMap
import com.google.gson.annotations.SerializedName

data class Post (
        @SerializedName ("userId")
        val userIdDto: Int,
        @SerializedName ("id")
        val idDto: Int,
        @SerializedName ("title")
        val titleDto: String,
        @SerializedName ("body")
        val bodyDto: String
        )