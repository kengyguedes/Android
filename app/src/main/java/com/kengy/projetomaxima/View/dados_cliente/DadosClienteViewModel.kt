package com.kengy.projetomaxima.View.dados_cliente

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.kengy.projetomaxima.Repository.RepositoryCliente
import com.kengy.projetomaxima.database.entity.EntityCliente
import com.kengy.projetomaxima.database.entity.EntityContato

class DadosClienteViewModel (application: Application): AndroidViewModel(application) {

    private val _repositoryCli =  RepositoryCliente(application)
    init {
        getClienteFromServer()
    }

    fun  getClienteFromServer() = _repositoryCli.getClienteFromServer()

    fun  getCliente() = _repositoryCli.listCliente
    fun getclientFomBD() = _repositoryCli.getClientesFromBD()
    fun addClientesBD (cliente: EntityCliente, listaContatos:List<EntityContato>) {
        _repositoryCli.addClientesBD(cliente,listaContatos)
    }
}