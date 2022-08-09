package com.frogobox.minimummvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

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
    var _mainData = MutableLiveData<MutableList<MainData>>()
    var mainData: LiveData<MutableList<MainData>> = _mainData

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
        _mainData.postValue(data)
    }

}