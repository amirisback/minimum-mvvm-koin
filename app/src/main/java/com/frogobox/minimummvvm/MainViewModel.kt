package com.frogobox.minimummvvm

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.frogobox.minimummvvm.MainAdapter
import com.frogobox.minimummvvm.MainData
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
 * Created by faisalamir on 08/02/22
 * recyclercoroutines
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Mona Primaveras Inc.      
 * All rights reserved
 *
 */

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val data = mutableListOf<MainData>()
    val listMainData = MutableLiveData<MutableList<MainData>>()

    fun setupData() {
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        listMainData.postValue(data)
    }

}