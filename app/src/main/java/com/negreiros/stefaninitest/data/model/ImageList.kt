package com.negreiros.stefaninitest.data.model


import com.google.gson.annotations.SerializedName

data class ImageList(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)