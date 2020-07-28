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

        if (Utils.isNetworkAvailable(context)) {
            getDataFromApi()
        } else {
            getDataFromBd()
        }


    }

    private fun getDataFromBd() {
        dadosClienteViewModel.getclientFomBD().observe(this, Observer {

            insereCamposCliente(it.get(0).cliente)
            if (it.get(0).lstContatos.size >0)

            insereCamposContato(it[0].lstContatos[0])
            val date = Utils.getDate()
            val status = it[0].cliente.status
            btn_verificar_status_cli.setOnClickListener {
                Utils.showSnackBarStausCli(ly_dados_cli, date, status)
            }
        })

    }

    private fun getDataFromApi() {
        dadosClienteViewModel.getCliente().observe(this, Observer {
            insereCamposCliente(it)
            if (it.listContato !=null)
            insereCamposContato(it.listContato!![0])
            val date = Utils.getDate()
            val status = it.status
            btn_verificar_status_cli.setOnClickListener {
                Utils.showSnackBarStausCli(ly_dados_cli, date, status)
            }
        })
        dadosClienteViewModel.getClienteFromServer()
    }


    fun insereCamposCliente(cliente: EntityCliente) {

        txt_nome_cliente.text = cliente.razao_social
        txt_fantasia_cliente.text = cliente.nomeFantasia
        txt_cnpj.text = cliente.cnpj
        txt_ramo_atividade.text = cliente.ramo_atividade
        txt_endereco.text = cliente.endereco
    }

    fun insereCamposContato(contatos: EntityContato) {
        txt_nome_contato.text = contatos.nome
        txt_telefone.text = contatos.telefone
        txt_celular.text = contatos.celular
        txt_conjugue.text = contatos.conjuge
        txt_tipo.text = contatos.tipo
        txt_time.text = contatos.time
        txt_emal.text = contatos.e_mail
        txt_dt_nascimento.text = contatos.data_nascimento
        txt_time2.text = contatos.time
    }
}