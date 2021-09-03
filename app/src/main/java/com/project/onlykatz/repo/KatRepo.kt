package com.project.onlykatz.repo

import android.util.Log
import com.project.onlykatz.model.Kat
import com.project.onlykatz.repo.remote.RetrofitInstance

class KatRepo(val instance: RetrofitInstance) {

    val TAG = "KAT-REPO"

    suspend fun getKats(limit:Int, page:Int, order:String):List<Kat>?{
        val katResult = RetrofitInstance.KatService.getKatImages(limit, page, order)

        if (katResult.isSuccessful){
            Log.e(TAG, "getKats: was successful. Got Kats.")
            return katResult.body()?.katList ?: listOf()
        } else {
            Log.e(TAG, "getKats: sorry error, ${katResult.errorBody()}.")
            return null
        }
    }
}