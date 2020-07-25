package com.kengy.projetomaxima.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.kengy.projetomaxima.R
import kotlinx.android.synthetic.main.activity_main.*

class MenuPrincipal : AppCompatActivity(), View.OnClickListener {

    private lateinit var cardCliente: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardCliente = card_cliente

        cardCliente.setOnClickListener(this)


    }

    override fun onClick (view : View){

        if (view != null){

            when(view.id){
                cardCliente.id -> {
                    startActivity(
                        Intent(this,BottonNavClient::class.java)
                    )

                }
            }
        }
    }
}
