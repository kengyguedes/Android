package com.kengy.projetomaxima.View.ui.dados_cliente

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kengy.projetomaxima.Repository.RepositoryCliente

class DadosClienteViewModel : ViewModel() {

    private val _repositoryCli =  RepositoryCliente()
    init {
        getClienteFromServer()
    }

    fun  getClienteFromServer() = _repositoryCli.getClienteFromServer()

    fun  getCliente() = _repositoryCli.listCliente
}