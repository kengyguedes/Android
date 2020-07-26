package com.kengy.projetomaxima.Repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.kengy.projetomaxima.api.ApiService
import com.kengy.projetomaxima.model.Cliente
import com.kengy.projetomaxima.model.MyCliente
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryCliente {


    val listCliente = MutableLiveData<Cliente>()

    fun getClienteFromServer() {

        val request = ApiService.getEndPonts()
        request.getAllCli().enqueue(object : Callback<MyCliente> {

            override fun onResponse(call: Call<MyCliente>, response: Response<MyCliente>) {

                if (response.code() == 200 && response.body() != null) {
                    Log.d("sucesso", "Requisição sucesso")
                    var listPed = response.body()?.cliente
                    listCliente.value = response.body()?.cliente

                    /* resultado?.let {
                         it.forEach{
                             doAsync {
                                 database.Dao().addSingleProduct(it)
                             }
                         }
                     }*/
                }

            }

            override fun onFailure(call: Call<MyCliente>, t: Throwable) {
                Log.wtf("Falha", "Requisição falhou")
            }

        })
    }
}