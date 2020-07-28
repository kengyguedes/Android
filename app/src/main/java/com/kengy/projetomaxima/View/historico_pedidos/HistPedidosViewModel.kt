package com.kengy.projetomaxima.View.historico_pedidos

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.kengy.projetomaxima.Repository.RepositoryPedidos
import com.kengy.projetomaxima.database.entity.EntityLegendaPedido
import com.kengy.projetomaxima.database.entity.EntityPedido
import com.kengy.projetomaxima.mock.DadosMock


class HistPedidosViewModel(application: Application) : AndroidViewModel(application) {

    private var _repositoryPedidos = RepositoryPedidos(application)


    fun getListFromMutableLiveData() = _repositoryPedidos.listHistPedo
    fun getHistPedFromServer() = _repositoryPedidos.getHistPedFromServer()
    fun getHistPedFromBD() = _repositoryPedidos.getHistPedFromBD()

   //TestMock
    fun addPedidoBD(){

        DadosMock.lstPedido.forEach{
            _repositoryPedidos.addPedidoBD(it,it.legendas)
        }
    }

}