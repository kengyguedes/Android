package com.kengy.projetomaxima.View.ui.historico_pedidos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.commons.AdapterListPedidos
import kotlinx.android.synthetic.main.fragment_hist_pedidos.*


class HistPedidosFragment : Fragment() {

    private lateinit var histPedViewModel: HistPedidosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_hist_pedidos,container,false)
    }


    override fun onResume() {
        super.onResume()

        histPedViewModel =ViewModelProviders.of(this).get(HistPedidosViewModel::class.java)
        histPedViewModel.getListFromMutableLiveData()?.observe(this, Observer {
            rv_hist_ped.layoutManager = LinearLayoutManager(context)
            rv_hist_ped.adapter = AdapterListPedidos(it)

        })

        histPedViewModel.getHistPedFromServer()
    }
}