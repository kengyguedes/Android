package com.kengy.projetomaxima.View

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.utils.Utils
import kotlinx.android.synthetic.main.fragment_dialog_legendas.view.*


open class FragDialogLegendas : DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val view: View = activity?.layoutInflater!!.inflate(R.layout.fragment_dialog_legendas, null)

        Utils.setImage(view.img_dialog_leg_pedRecusado, "!", "#FF9900")
        Utils.setImage(view.img_dialog_leg_posiPendente, "P", "#606060")
        Utils.setImage(view.img_dialog_leg_posiBloq, "B", "#3557AA")
        Utils.setImage(view.img_dialog_leg_liberado, "L", "#186096")
        Utils.setImage(view.img_dialog_leg_montado, "M", "#7FAA33")
        Utils.setImage(view.img_dialog_leg_faturado, "F", "#64863B")
        Utils.setImage(view.img_dialog_leg_cancelado, "C", "#E40613")
        Utils.setImage(view.img_dialog_leg_orcamento, "O", "#2D3E4E")

        val dialog = AlertDialog.Builder(activity)
        dialog.setCancelable(true)
            .setView(view)
            .setNegativeButton("FECHAR") { _, _ -> }

        return dialog.create()
    }


}