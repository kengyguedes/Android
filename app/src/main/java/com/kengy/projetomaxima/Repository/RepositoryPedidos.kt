package com.kengy.projetomaxima.Repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kengy.projetomaxima.api.ApiService
import com.kengy.projetomaxima.database.MaxDataBase
import com.kengy.projetomaxima.database.entity.EntityLegendaPedido
import com.kengy.projetomaxima.database.entity.EntityPedido
import com.kengy.projetomaxima.database.entity.PedidoWithLegends
import com.kengy.projetomaxima.model.MyPedido
import org.jetbrains.anko.doAsync
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryPedidos(context: Context) {
// class AppRepositoryPedidos (){

    val listHistPedo = MutableLiveData<List<EntityPedido>>()
    private var _dao = MaxDataBase.getInstance(context)

    fun getHistPedFromServer() {

        val request = ApiService.getEndPonts()

        request.getAllPed().enqueue(object : Callback<MyPedido> {


            override fun onResponse(call: Call<MyPedido>, response: Response<MyPedido>) {

                if (response.code() == 200 && response.body() != null) {
                    Log.d("sucesso", "Requisição sucesso")
                    listHistPedo.value = response.body()?.pedidos

                    Thread {
                        response.body()?.pedidos?.forEach {
                            addPedidoBD(it, it.legendas)
                        }
                    }.start()
                }
            }

            override fun onFailure(call: Call<MyPedido>, t: Throwable) {
                Log.wtf("Falha", "Requisição falhou $t")
            }
        })
    }

    fun addPedidoBD(pedido: EntityPedido, listLegendas: List<String>?) {

        var lstAux = mutableListOf<EntityLegendaPedido>()

        listLegendas?.forEach {

            lstAux.add(EntityLegendaPedido(pedido.numero_ped_Rca, it, pedido.numero_ped_Rca))
        }
        doAsync {
            _dao.Dao().gravaPedidosBanco1(pedido, lstAux)
        }
    }

    fun getHistPedFromBD(): LiveData<List<PedidoWithLegends>> = _dao.Dao().getHistPedFromBD()

}


