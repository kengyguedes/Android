package com.kengy.projetomaxima.View.ui.historico_pedidos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amulyakhare.textdrawable.TextDrawable
import com.amulyakhare.textdrawable.util.ColorGenerator
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.model.Pedidos
import com.kengy.projetomaxima.utils.Utils
import kotlinx.android.synthetic.main.adapter_hist_pedidos.view.*


class AdapterListPedidos(private val pedidos: List<Pedidos>) :
    RecyclerView.Adapter<AdapterListPedidos.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_hist_pedidos, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pedidos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindData(pedidos[position])

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



        fun bindData(pedido: Pedidos) {


            val letra: String = pedido.NOMECLIENTE.first().toString()

            val generator: ColorGenerator = ColorGenerator.MATERIAL; // or use DEFAULT

            val color = generator.getRandomColor();

            val drawable = TextDrawable.builder()
                .buildRound(letra, color)

            val image = itemView.img_letra

            image.setImageDrawable(drawable)


            itemView.txt_numped_rca_erp.text =
                " ${pedido.numero_ped_Rca} / ${pedido.numero_ped_erp}"
            itemView.txt_cliente.text = "${pedido.codigoCliente} - ${pedido.NOMECLIENTE}"
            itemView.txt_status.text = pedido.status



            if (pedido.critica == null) {
                itemView.img_critica.setImageResource(R.mipmap.ic_maxima_aguardando_critica)
            } else
                if (pedido.critica.equals("ALERTA")) {
                    itemView.img_critica.setImageResource(R.mipmap.ic_maxima_critica_alerta)

                } else if (pedido.critica.equals("SUCESSO")) {
                    itemView.img_critica.setImageResource(R.mipmap.ic_maxima_critica_sucesso)

                }


            if (pedido.legendas != null && pedido.legendas.size != 0 ) {

                pedido.legendas.forEach{

                    when (it) {

                        "PEDIDO_CANCELADO_ERP" -> {
                            itemView.img_legenda_cancelado.setImageResource(R.mipmap.ic_maxima_legenda_cancelamento)
                            itemView.img_legenda_cancelado.visibility = View.VISIBLE
                        }
                        "PEDIDO_SOFREU_CORTE" -> {
                            itemView.img_legenda_corte.setImageResource(R.mipmap.ic_maxima_legenda_corte)
                            itemView.img_legenda_corte.visibility = View.VISIBLE
                        }
                        "PEDIDO_FEITO_TELEMARKETING" -> {
                            itemView.img_legenda_corte.setImageResource(R.mipmap.ic_maxima_legenda_telemarketing)
                            itemView.img_legenda_cancelado.visibility = View.VISIBLE
                        }
                    }
                }



            } else {
                itemView.img_legenda_corte.visibility = View.GONE
            }


            itemView.txt_data_pedido.text = Utils.formatterDate(pedido.data)


        }





    }

}