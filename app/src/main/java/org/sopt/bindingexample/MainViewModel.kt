package org.sopt.bindingexample

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var likes = MutableLiveData(0)

    fun likePressed() {
        likes.value = likes.value?.plus(1)
        Log.d(TAG, "likePressed: $likes ")
    }
}
