package com.kengy.projetomaxima.View.historico_pedidos

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.View.FragDialogLegendas
import com.kengy.projetomaxima.database.entity.EntityLegendaPedido
import com.kengy.projetomaxima.database.entity.EntityPedido
import com.kengy.projetomaxima.database.entity.PedidoWithLegends
import com.kengy.projetomaxima.utils.Utils
import kotlinx.android.synthetic.main.fragment_hist_pedidos.*


class HistPedidosFragment : Fragment() {

    private lateinit var _histPedViewModel: HistPedidosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _histPedViewModel = ViewModelProviders.of(this).get(HistPedidosViewModel::class.java)
        return inflater.inflate(R.layout.fragment_hist_pedidos, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.status_bar_hist_ped_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.menu_hist_ped_legendas -> {
                val diaFrag = FragDialogLegendas()
                diaFrag.show(childFragmentManager, "")
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onResume() {
        super.onResume()

        if (Utils.isNetworkAvailable(context)) {

            getDataFromApi()
        } else {
            getDataFromBd()
        }
    }

    private fun getDataFromBd() {
        _histPedViewModel.getHistPedFromBD().observe(this, Observer {

            rv_hist_ped.layoutManager = LinearLayoutManager(context)
            rv_hist_ped.adapter =
                AdapterListPedidos(Utils.convertLists(it))
        })
    }

    private fun getDataFromApi() {
        _histPedViewModel.getListFromMutableLiveData().observe(this, Observer {
            rv_hist_ped.layoutManager = LinearLayoutManager(context)
            rv_hist_ped.adapter =
                AdapterListPedidos(it)
        })
        _histPedViewModel.getHistPedFromServer()
    }



}