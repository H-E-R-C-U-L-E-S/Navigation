package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class NotificationsFragment : Fragment() {

    private lateinit var nextButt : Button
    private lateinit var nameEt : EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)

        nextButt = view.findViewById(R.id.buttonNext)
        nameEt = view.findViewById(R.id.nameEt)


        nextButt.setOnClickListener{
            val name = nameEt.text.toString()
            val bundle = Bundle()
            if (name.isNotEmpty()){
                bundle.putString("saxeli",name)
            }
            findNavController().navigate(R.id.action_notificationsFragment_to_settingsFragment,bundle)
        }

        return view
    }



}