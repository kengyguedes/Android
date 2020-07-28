package com.kengy.projetomaxima.utils

import android.content.Context
import android.graphics.Color
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Build
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat.getSystemService
import com.amulyakhare.textdrawable.TextDrawable
import com.google.android.material.snackbar.Snackbar
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.database.entity.EntityLegendaPedido
import com.kengy.projetomaxima.database.entity.EntityPedido
import com.kengy.projetomaxima.database.entity.PedidoWithLegends
import kotlinx.android.synthetic.main.fragment_dados_cliente.*
import java.text.SimpleDateFormat
import java.util.*

object Utils {

    fun formatterDate(strDate: String): String {

        val data = strDate.substring(0..9)
        val hora = strDate.substring(11..15)

        val formatoDataAtual = SimpleDateFormat("yyyy-mm-dd")
        val dataAtual = Date()
        val dataFormated = formatoDataAtual.format(dataAtual)

        if (data.equals(dataFormated.toString()))
            return hora

        return data

    }


    fun getDate(): String {

        val formatoDataAtual = SimpleDateFormat("yyyy-mm-dd")
        val dataAtual = Date()
        val dataFormated = formatoDataAtual.format(dataAtual)

        return dataFormated

    }


    fun setImage(view: ImageView, letra: String, color:String) {

        val drawable = TextDrawable.builder()
            .beginConfig()
            .bold()
            .endConfig()
            .buildRound(letra, hexConverterToColor(color) )

        view.setImageDrawable(drawable)

    }


    fun hexConverterToColor(hex: String): Int {

        val color = Color.parseColor(hex)
        return color
    }

    fun showSnackBarStausCli(v: View, date: String, status: String) {
        Snackbar.make(
            v,
            "$date - $status ", // Message to show
            Snackbar.LENGTH_LONG //
        ).setAction( // Set an action for snack bar
            "FECHAR" // Action button text
        ) {
            v.setBackgroundColor(Color.parseColor("#f2f2f2"))
        }.show() // Finally show the snack bar

    }


    fun isNetworkAvailable(context: Context?): Boolean {
        val connectivityManager = context?.getSystemService(Context.CONNECTIVITY_SERVICE)

        return if (connectivityManager is ConnectivityManager) {
            val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
            networkInfo?.isConnected ?: false
        } else false
    }

    fun convertLists(lst: List<PedidoWithLegends>): List<EntityPedido> {
        var lstAuxPedido = mutableListOf<EntityPedido>()
        lst.forEach {
            lstAuxPedido.add(
                EntityPedido(
                    it.pedido.numero_ped_Rca
                    ,
                    it.pedido.numero_ped_erp
                    ,
                    it.pedido.codigoCliente,
                    it.pedido.NOMECLIENTE,
                    it.pedido.data,
                    it.pedido.status,
                    it.pedido.critica,
                    it.pedido.tipo,
                    getListLegends(it.lstLegendas)
                )
            )
        }
        return lstAuxPedido
    }

    private fun getListLegends(lstLegendas: List<EntityLegendaPedido>): List<String> {
        var lstAux = mutableListOf<String>()
        lstLegendas.forEach {
            lstAux.add(it.legenda)
        }
        return lstAux

    }


}