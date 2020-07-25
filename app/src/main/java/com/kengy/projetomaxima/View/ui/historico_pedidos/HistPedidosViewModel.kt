package com.kengy.projetomaxima.View.ui.historico_pedidos

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.kengy.projetomaxima.Repository.AppRepository

class HistPedidosViewModel: ViewModel() {

    private val _appRepository = AppRepository()

    fun getListFromMutableLiveData() = _appRepository.listHistPedo


       fun  getHistPedFromServer() = _appRepository.getHistPedFromServer()


}