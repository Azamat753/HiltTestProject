package com.example.hilttestproject.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.data.data.storage.sharedprefs.GetUserNameUseCase
import com.example.data.data.storage.sharedprefs.SaveUserNameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getUserNameUseCase: GetUserNameUseCase,
    private val saveUserNameUseCase: SaveUserNameUseCase
) : ViewModel() {
    init {
        Log.e("ololo", "VM created ")
    }

    override fun onCleared() {
        Log.e("ololo", "VM cleared ")
        super.onCleared()
    }
}