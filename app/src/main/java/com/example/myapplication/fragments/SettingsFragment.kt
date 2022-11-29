package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class SettingsFragment : Fragment() {

    private  lateinit var nameTv : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        nameTv = view.findViewById(R.id.nameTv)

        val amount = arguments?.getString("saxeli")
        nameTv.text = amount.toString()

        return view
    }

}