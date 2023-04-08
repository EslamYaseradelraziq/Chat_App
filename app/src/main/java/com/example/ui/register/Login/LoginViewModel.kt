package com.example.ui.register.Login

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val email = ObservableField<String>()
    val emailError = ObservableField<String?>()
    val password = ObservableField<String>()
    val passwordError = ObservableField<String?>()
    fun login() {
        if (!validForm()) return
    }

    fun validForm(): Boolean {
        var isValide = true

        if (email.get().isNullOrBlank()) {
            emailError.set("please enter your email")
            isValide = false
        } else {
            isValide = true
            emailError.set(null)
        }
        if (password.get().isNullOrBlank()) {
            isValide = false
            passwordError.set("please re-enter password")
        } else {
            isValide = false
            passwordError.set(null)
        }
        return isValide

    }
}