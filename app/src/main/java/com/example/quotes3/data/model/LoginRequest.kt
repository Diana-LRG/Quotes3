package com.example.quotes3.data.model

import com.google.gson.annotations.SerializedName

data class LoginRequest (
    @SerializedName("account")
    var account: String,

    @SerializedName("password")
    var password: String
)