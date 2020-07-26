package com.kengy.projetomaxima.View.ui.dados_cliente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.utils.Utils
import kotlinx.android.synthetic.main.fragment_dados_cliente.*


class DadosClienteFragment : Fragment() {

    private lateinit var dadosClienteViewModel: DadosClienteViewModel
    val utils = Utils()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dadosClienteViewModel =
            ViewModelProviders.of(this).get(DadosClienteViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dados_cliente, container, false)
       // val textView: TextView = root.findViewById(R.id.text_home)
        dadosClienteViewModel.getCliente().observe(this, Observer {


        })
        return root
    }

    override fun onResume() {
        super.onResume()

        val date  = "10/09/2018 17:24"
        val status  = "Status ativo"

        btn_verificar_status_cli.setOnClickListener{
          utils.showSnackBarStausCli(ly_dados_cli,date,status)
        }
    }
}