package com.example.ostoslista

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ostoslista.database.KategoryDao
import kotlinx.coroutines.launch

class KategoryViewModel(

    val database: KategoryDao,
    application: Application
) : ViewModel() {

        //fun onSetSleepQuality(quality: Int) {
        fun onGetKategory(kategoryId: Int) {
            viewModelScope.launch {
                /*
                val tonight = database.get(sleepNightKey) ?: return@launch
                tonight.sleepQuality = quality
                */

                database.get(kategoryId)

                // Setting this state variable to true will alert the observer and trigger navigation.
               //TODO
                // _navigateToSleepTracker.value = true
            }
        }
}