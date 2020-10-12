package com.example.ostoslista

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ostoslista.database.KategoryDao

//SSL Mallia SleepTrackerViewModelFactory:stä
class KategoryViewModelFactory (

        private val dataSource:KategoryDao,
        private val application: Application):ViewModelProvider.Factory{
    @Suppress("unchecked_cast") //SSL mitähän tämä tarkoittaa
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(KategoryViewModel::class.java)) {
            return KategoryViewModel( dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}