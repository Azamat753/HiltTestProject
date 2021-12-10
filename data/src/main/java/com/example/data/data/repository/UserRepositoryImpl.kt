package com.example.data.data.repository

import com.example.data.data.storage.UserStorage
import com.example.data.data.storage.models.SaveUserNameParam

class UserRepositoryImpl(userStorage: UserStorage) : UserRepository() {
    override fun saveName(saveParam: SaveUserNameParam) {
        TODO("Not yet implemented")
    }

    override fun getName() {
        TODO("Not yet implemented")
    }

}