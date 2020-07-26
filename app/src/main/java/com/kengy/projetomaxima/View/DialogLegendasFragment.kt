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
    val utils = Utils()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val view: View = activity?.layoutInflater!!.inflate(R.layout.fragment_dialog_legendas, null)

        utils.setImage(view.img_dialog_leg_pedRecusado, "!", "#FF9900")
        utils.setImage(view.img_dialog_leg_posiPendente, "P", "#606060")
        utils.setImage(view.img_dialog_leg_posiBloq, "B", "#3557AA")
        utils.setImage(view.img_dialog_leg_liberado, "L", "#186096")
        utils.setImage(view.img_dialog_leg_montado, "M", "#7FAA33")
        utils.setImage(view.img_dialog_leg_faturado, "F", "#64863B")
        utils.setImage(view.img_dialog_leg_cancelado, "C", "#E40613")
        utils.setImage(view.img_dialog_leg_orcamento, "O", "#2D3E4E")

        val dialog = AlertDialog.Builder(activity)
        dialog.setCancelable(true)
            .setView(view)
            .setNegativeButton("FECHAR") { _, _ -> }

        return dialog.create()
    }


}