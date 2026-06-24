package com.seuapp.gestaofit.data

sealed class LoginResult<out T> {

    data class Success<out T>(
        val data: T
    ) : LoginResult<T>()

    data class Error(
        val exception: Exception
    ) : LoginResult<Nothing>()
}