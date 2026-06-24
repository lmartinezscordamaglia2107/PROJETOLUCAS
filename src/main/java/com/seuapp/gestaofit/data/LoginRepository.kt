package com.seuapp.gestaofit.data

/**
 * Classe de dados que representa o usuário logado.
 * Corrigido: Renomeado de LoginRepository para LoggedInUser para refletir o modelo de dados.
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)

/**
 * Class selada para gerenciar o resultado das operates de Login.
 * Corridor: Removal a duplicities de pacotes e unification em uma structural logical.
 */
sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
        }
    }
}