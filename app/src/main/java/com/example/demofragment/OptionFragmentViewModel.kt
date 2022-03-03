package com.example.demofragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val STATE_COUNT: String = "STATE_COUNT"

class OptionFragmentViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _count = savedStateHandle.getLiveData(STATE_COUNT, 0)
    val count: LiveData<Int>
        get() = _count

    fun incrementCount() {
        _count.value = _count.value!!.plus(1)
    }

}
