package com.kengy.projetomaxima.Repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.kengy.projetomaxima.api.ApiService
import com.kengy.projetomaxima.model.MyPedido
import com.kengy.projetomaxima.model.Pedidos
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AppRepository() {
   // class AppRepository(context: Context) {


     val listHistPedo = MutableLiveData<List<Pedidos>>()

    fun getHistPedFromServer () {

        val request = ApiService.getEndPonts()

        request.getAllPed().enqueue(object : Callback<MyPedido>{


            override fun onResponse(call: Call<MyPedido>, response: Response<MyPedido>) {

                if (response.code() == 200){
                    Log.d("sucesso", "Requisição sucesso")
                    var listPed = response.body()?.pedidos
                    listHistPedo.value= response.body()?.pedidos
                    listHistPedo.value = listPed
                    var teste = 10

                    teste+=5


                   /* resultado?.let {
                        it.forEach{
                            doAsync {
                                database.Dao().addSingleProduct(it)
                            }
                        }
                    }*/
                }

            }

            override fun onFailure(call: Call<MyPedido>, t: Throwable) {
                Log.wtf("Falha", "Requisição falhou")
            }

        })
    }

}


