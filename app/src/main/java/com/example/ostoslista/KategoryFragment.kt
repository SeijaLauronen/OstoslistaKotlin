package com.example.ostoslista

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
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
        /*
        // Get a reference to the binding object and inflate the fragment views.
        val binding: FragmentSleepTrackerBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_sleep_tracker, container, false)
        */

        // 19.11.2020 SSL Create an instance of the ViewModel Factory.
        val application = requireNotNull(this.activity).application
        //val arguments = SleepQualityFragmentArgs.fromBundle(arguments!!)

        val dataSource = ProductDatabase.getInstance(application).kategoryDao

        // Create an instance of the ViewModel Factory.
        //val viewModelFactory = SleepTrackerViewModelFactory(dataSource, application)
        val viewModelFactory = KategoryViewModelFactory(dataSource, application)

        // Get a reference to the ViewModel associated with this fragment.
        val kategoryrViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(KategoryViewModel::class.java)

        // To use the View Model with data binding, you have to explicitly
        // give the binding object a reference to it.
        //binding.sleepTrackerViewModel = sleepTrackerViewModel
        //binding

        // Specify the current activity as the lifecycle owner of the binding.
        // This is necessary so that the binding can observe LiveData updates.
        //binding.setLifecycleOwner(this)
//19.11.2020 SSL END



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