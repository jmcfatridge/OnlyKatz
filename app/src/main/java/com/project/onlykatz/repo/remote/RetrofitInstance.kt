package com.project.onlykatz.repo.remote

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://api.thecatapi.com"

    //Initialize and build a retrofit http handler
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val KatService by lazy { retrofit.create(KatService::class.java) }
}