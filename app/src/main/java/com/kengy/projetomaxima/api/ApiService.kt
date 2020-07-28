package com.kengy.projetomaxima.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    private fun getRegrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://maximatech.free.beeceptor.com/android/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getEndPonts () : EndPoints{

        return getRegrofit().create(EndPoints::class.java)
    }
}