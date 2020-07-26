package com.kengy.projetomaxima.utils

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import com.amulyakhare.textdrawable.TextDrawable
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_dados_cliente.*
import java.text.SimpleDateFormat
import java.util.*

object Utils {


    fun formatterDate(strDate: String): String {

        //   var srtFormated =  strDate.replace("T"," ").replaceRange(19..23,"") "2018-09-11T12:30:19-0300"
        //   val date = LocalDate.parse(srtFormated, DateTimeFormatter.ISO_OFFSET_DATE_TIME)

        val data = strDate.substring(0..9)
        val hora = strDate.substring(11..15)

        val formatoDataAtual: SimpleDateFormat = SimpleDateFormat("yyyy-mm-dd")
        val dataAtual = Date()
        val dataFormated = formatoDataAtual.format(dataAtual)

        if (data.equals(dataFormated.toString()))
            return hora

        return data

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

        var color = Color.parseColor(hex)
        return color
    }

    fun showSnackBarStausCli(v: View, date: String, status: String) {
        Snackbar.make(
            v,
            "$date - $status ", // Message to show
            Snackbar.LENGTH_LONG //
        ).setAction( // Set an action for snack bar
            "FECHAR", // Action button text
            {
                v.setBackgroundColor(Color.parseColor("#f2f2f2"))
            }).show() // Finally show the snack bar

    }


}