package com.kengy.projetomaxima.View.alvaras

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kengy.projetomaxima.R

class AlvarasFragment : Fragment() {

    private lateinit var notificationsViewModel: AlvarasViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProviders.of(this).get(AlvarasViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_alvaras, container, false)
        //    val textView: TextView = root.findViewById(R.id.text_notifications)
        notificationsViewModel.text.observe(this, Observer {
            //      textView.text = it
        })
        return root
    }


    override fun onResume() {
        super.onResume()
      // img_alvaras.set
    }
}