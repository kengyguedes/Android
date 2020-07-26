package com.kengy.projetomaxima.View

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.kengy.projetomaxima.R
import kotlinx.android.synthetic.main.activity_main.*

class MenuPrincipal : AppCompatActivity(), View.OnClickListener {

    private val Context._isConnected: Boolean
        get() {
            return (getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
                .activeNetworkInfo?.isConnected == true
        }

    val liveNet = MutableLiveData<Boolean>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_cliente.setOnClickListener(this)

    }

    override fun onClick (view : View){

        if (view != null){
            when(view.id){
                card_cliente.id -> {
                    startActivity(
                        Intent(this,BottonNavClient::class.java)
                    )
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()

        liveNet.value = _isConnected
        liveNet.observe(this,Observer{
            atualizaStatusConexao(img_network,it)
        })

    }



    private fun atualizaStatusConexao (imgView: ImageView, conectado: Boolean) {

        if (conectado) {
            imgView.setImageResource(R.mipmap.ic_maxima_nuvem_conectado)
        } else
            imgView.setImageResource(R.mipmap.ic_maxima_nuvem_desconectado)
    }

}
