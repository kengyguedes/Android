package com.kengy.projetomaxima.View.ui.dados_cliente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kengy.projetomaxima.R


class DadosClienteFragment : Fragment() {

    private lateinit var homeViewModel: DadosClienteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(DadosClienteViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dados_cliente, container, false)
       // val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
      //      textView.text = it
        })
        return root
    }
}