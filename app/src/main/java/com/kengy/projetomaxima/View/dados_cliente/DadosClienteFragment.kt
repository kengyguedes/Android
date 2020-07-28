package com.kengy.projetomaxima.View.dados_cliente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.database.entity.EntityCliente
import com.kengy.projetomaxima.database.entity.EntityContato
import com.kengy.projetomaxima.mock.DadosMock
import com.kengy.projetomaxima.utils.Utils
import kotlinx.android.synthetic.main.fragment_dados_cliente.*


class DadosClienteFragment : Fragment() {

    private lateinit var dadosClienteViewModel: DadosClienteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dadosClienteViewModel =
            ViewModelProviders.of(this).get(DadosClienteViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dados_cliente, container, false)
        return root
    }

    override fun onResume() {
        super.onResume()

        dadosClienteViewModel.getCliente().observe(this, Observer {
          //  insereCamposCliente(it)
          //  insereCamposContato(it.contatos[0])
        })

        val date = getString(R.string.date)
        val status = getString(R.string.status_cliente)
        btn_verificar_status_cli.setOnClickListener {
            Utils.showSnackBarStausCli(ly_dados_cli, date, status)
        }

        dadosClienteViewModel.getclientFomBD().observe(this, Observer {

            val i = it
            insereCamposCliente(it.get(0).cliente)
            insereCamposContato(it.get(0).lstContatos.get(0))
        })

        dadosClienteViewModel.addClientesBD(DadosMock.cliente,DadosMock.contato)
    }


    fun insereCamposCliente(cliente: EntityCliente) {

        txt_nome_cliente.text = cliente.razao_social
        txt_fantasia_cliente.text = cliente.nomeFantasia
        txt_cnpj.text = cliente.cnpj
        txt_ramo_atividade.text = cliente.ramo_atividade
        txt_endereco.text = cliente.endereco
    }

    fun insereCamposContato(contatos: EntityContato){
        txt_nome_contato.text= contatos.nome
        txt_telefone.text= contatos.telefone
        txt_celular.text= contatos.celular
        txt_conjugue.text= contatos.conjuge
        txt_tipo.text= contatos.tipo
        txt_time.text = contatos.time
        txt_emal.text= contatos.e_mail
        txt_dt_nascimento.text= contatos.data_nascimento
        txt_time2.text = contatos.time
    }
}