package com.kengy.projetomaxima.Repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kengy.projetomaxima.api.ApiService
import com.kengy.projetomaxima.database.MaxDataBase
import com.kengy.projetomaxima.database.entity.ClienteWithContatos
import com.kengy.projetomaxima.database.entity.EntityCliente
import com.kengy.projetomaxima.database.entity.EntityContato
import com.kengy.projetomaxima.model.Cliente
import com.kengy.projetomaxima.model.MyCliente
import org.jetbrains.anko.doAsync
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryCliente(context: Context) {


    val listCliente = MutableLiveData<Cliente>()
    private var _dao = MaxDataBase.getInstance(context)

    fun getClienteFromServer() {

        val request = ApiService.getEndPonts()
        request.getAllCli().enqueue(object : Callback<MyCliente> {

            override fun onResponse(call: Call<MyCliente>, response: Response<MyCliente>) {

                if (response.code() == 200 && response.body() != null) {
                    Log.d("sucesso", "Requisição sucesso")
                    listCliente.value = response.body()?.cliente

//                    response.let {
//                        it.forEach {
//                            doAsync {
//                                _dao.Dao().savePedi(it)
//                            }
//                        }
//                    }
                }

            }

            override fun onFailure(call: Call<MyCliente>, t: Throwable) {
                Log.wtf("Falha", "Requisição falhou")
            }

        })
    }


    fun getClientesFromBD(): LiveData<List<ClienteWithContatos>> =
        _dao.Dao().getClienteWithContato()

    fun addClientesBD(cliente: EntityCliente, listaContatos: List<EntityContato>) {
        doAsync {
            _dao.Dao().gravaClientesBanco(cliente, listaContatos)
        }
    }
}