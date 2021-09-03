package com.project.onlykatz.repo.remote

import com.project.onlykatz.model.KatResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Headers

interface KatService {

    @Headers("x-api-key: 8a1833a1-c297-44d6-ba65-890eb1dc7801")
    @GET("/v1/images/search")
    suspend fun getKatImages(
        @Query("limit") limit: Int = 1,
        @Query("page") page: Int = 1,
        @Query("order") order: String = "DESC"
    ):Response<KatResponse>
}