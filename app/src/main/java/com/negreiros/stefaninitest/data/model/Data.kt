package com.negreiros.stefaninitest.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("images")
    val images: List<Image>,
    @SerializedName("type")
    val type: String
)