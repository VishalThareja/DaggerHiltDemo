package com.vishalthareja.daggerhiltdemo.ui

import android.app.Application
import android.util.Log
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.SavedStateHandle

/**
 * @author Vishal Thareja
 */
class MainActivityViewModel  @ViewModelInject constructor(application: Application,
                                                          @Assisted private val state: SavedStateHandle
) :
    AndroidViewModel(application) {

    fun hi() {
        Log.e("hi","vishal")
    }
}