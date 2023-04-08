package com.example.ui.register.Login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chat_app.R
import com.example.chat_app.databinding.ContentLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var viewBinding: ContentLoginBinding
    lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.content_login)
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]


    }
}