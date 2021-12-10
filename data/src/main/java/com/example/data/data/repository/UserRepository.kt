package com.example.data.data.repository

import com.example.data.data.storage.models.SaveUserNameParam

open interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam)
    fun getName()

}