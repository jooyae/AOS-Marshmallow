package org.journey.juyaemarshmallow.data

import androidx.lifecycle.MutableLiveData

object NetworkStatus {
    enum class State{
        LOADING,RETRY,FAILED,DONE
    }
    var mutableState : MutableLiveData<State> = MutableLiveData()

    fun updateNetworkState(state : State){
        mutableState.postValue(state)
    }
}