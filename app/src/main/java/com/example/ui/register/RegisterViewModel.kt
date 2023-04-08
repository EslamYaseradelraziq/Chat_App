package com.example.ui.register

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
    val userName = ObservableField<String>()
    val userNameError = ObservableField<String?>()
    val email = ObservableField<String>()
    val emailError = ObservableField<String?>()
    val password = ObservableField<String>()
    val passwordError = ObservableField<String?>()
    val passwordConfirm = ObservableField<String>()
    val passwordConfirmError = ObservableField<String?>()

    fun register() {
        if (!validForm()) return
    }

    fun validForm(): Boolean {
        var isValide = true
        if (userName.get().isNullOrBlank()) {
            userNameError.set("pleas enter your name")
            isValide = false
        } else {
            isValide = true
            userNameError.set(null)
        }
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
        if (passwordConfirm.get().isNullOrBlank()) {
            isValide = false
            passwordConfirmError.set("doesn't match")
        } else {
            isValide = false
            passwordConfirmError.set(null)
        }
        return isValide

    }


}

