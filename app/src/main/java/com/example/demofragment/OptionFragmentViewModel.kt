package com.example.demofragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OptionFragmentViewModel : ViewModel() {

    private val _count: MutableLiveData<Int> = MutableLiveData(0)
    val count: LiveData<Int>
        get() = _count

    fun incrementCount() {
        _count.value = _count.value!!.plus(1)
    }

}
