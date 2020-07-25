package com.kengy.projetomaxima.api

import com.kengy.projetomaxima.model.Cliente
import com.kengy.projetomaxima.model.MyPedido
import com.kengy.projetomaxima.model.Pedidos
import retrofit2.Call
import retrofit2.http.GET


//http://maximatech.free.beeceptor.com/android/pedido
interface EndPoints {

    @GET("pedido")
    fun getAllPed(): Call<MyPedido>

    @GET("cliente")
    fun getAllCli(): Call<List<Cliente>>


}