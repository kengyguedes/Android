package com.kengy.projetomaxima.View.ui.historico_pedidos

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.View.FragDialogLegendas
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

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater!!.inflate(R.menu.status_bar_hist_ped_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.menu_hist_ped_legendas-> {
                val diaFrag = FragDialogLegendas()
                diaFrag.show(fragmentManager,"teste")
                return true
            }
            else -> return super.onOptionsItemSelected(item)

        }


    }


    override fun onResume() {
        super.onResume()

        histPedViewModel =ViewModelProviders.of(this).get(HistPedidosViewModel::class.java)
        histPedViewModel.getListFromMutableLiveData()?.observe(this, Observer {
            rv_hist_ped.layoutManager = LinearLayoutManager(context)
            rv_hist_ped.adapter =
                AdapterListPedidos(it)

        })

        histPedViewModel.getHistPedFromServer()




    }



}