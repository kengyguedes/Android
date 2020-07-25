package com.kengy.projetomaxima.utils

import java.text.SimpleDateFormat
import java.util.*

class Utils {


    fun formatterDate(strDate: String): String {

        //   var srtFormated =  strDate.replace("T"," ").replaceRange(19..23,"") "2018-09-11T12:30:19-0300"
        //   val date = LocalDate.parse(srtFormated, DateTimeFormatter.ISO_OFFSET_DATE_TIME)

        val data = strDate.substring(0..9)
        val hora = strDate.substring(11..15)

        val formatoDataAtual: SimpleDateFormat = SimpleDateFormat("yyyy-mm-dd")
        val dataAtual= Date()
        val dataFormated = formatoDataAtual.format(dataAtual)

        if (data.equals(dataFormated.toString()))
            return hora

        return data

    }
}