package com.ndzindo.imagesearchapp.api

import com.ndzindo.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)