package com.example.ostoslista

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

//SSL TODO: Näitä tarviis:


//import androidx.databinding.DataBindingUtil //en saa tätä pelittämään

import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProvider

//import androidx.navigation.fragment.findNavController


import com.example.ostoslista.R
import com.example.ostoslista.database.ProductDatabase
//import com.example.ostoslista.databinding.FragmentKategoryBinding
//import com.google.android.material.snackbar.Snackbar

class KategoryFragment : Fragment() {

    //private var kategoryViewModel: KategoryViewModel? = null //SSL 12.10.2020, kun tuo ViewModelProviders ei toiminut

    companion object {
        fun newInstance() = KategoryFragment()
    }

    private lateinit var viewModel: KategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    //SSL 11.10. TODO:
        /*
        val binding: FragmentKategoryBinding = DataBindingUtil.inflate(
            inflater, R.layout.kategory_fragment,container,false)
        */

        return inflater.inflate(R.layout.kategory_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // 12.10.2020 Piti kommentoida, ettei kaadu:
        // 12.10.2020 SSL: tämä deprikoitunut : viewModel = ViewModelProviders.of(this).get(KategoryViewModel::class.java)

        //onko nyt jotenkin eroa siinä muistivuotojutussa, kun tuolla Providers:lla ei pitänyt käyttää new:ta,
        // että se new hanskataan automaattisesti?

        //onko nyt jotenkin eroa siinä muistivuotojutussa, kun tuolla Providers:lla ei pitänyt käyttää new:ta,
        // että se new hanskataan automaattisesti?
/* //14.10.2020 kommentoin tämän. SleepTracker-mallissa oli vain on CreateView:ssa koodia, tässä ei ollenkaan.
        val kategoryViewModel =
            ViewModelProvider(this)
                .get<KategoryViewModel>(KategoryViewModel::class.java)
        // TODO: Use the ViewModel

 */
    }

}