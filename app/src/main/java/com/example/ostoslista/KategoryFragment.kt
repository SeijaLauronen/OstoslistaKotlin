package com.example.ostoslista

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

//SSL TODO: Näitä tarviis:

//import androidx.databinding.DataBindingUtil //en saa tätä pelittämään
/*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.database.SleepDatabase
import com.example.android.trackmysleepquality.databinding.FragmentSleepTrackerBinding
import com.google.android.material.snackbar.Snackbar
*/


class KategoryFragment : Fragment() {

    companion object {
        fun newInstance() = KategoryFragment()
    }

    private lateinit var viewModel: KategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    //SSL 11.10. TODO:
       // val binding: FragmentKategoryBinding = DataBindingUtil.inflate

        return inflater.inflate(R.layout.kategory_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // 12.10.2020 Piti kommentoida, ettei kaadu:
        // 12.10.2020 SSL: tämä deprikoitunut : viewModel = ViewModelProviders.of(this).get(KategoryViewModel::class.java)

        // TODO: Use the ViewModel
    }

}