package com.example.quotes3.data.remote

import com.example.quotes3.domain.model.QuoteModel
import com.google.gson.annotations.SerializedName


data class QuoteApiResponse(
    @SerializedName("success")
    var success: Boolean,

    @SerializedName("message")
    var message: String,

    @SerializedName("data")
    var data: List<QuoteModel?>?

)