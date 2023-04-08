package com.example.ui.register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chat_app.R
import com.example.chat_app.databinding.ActivityMainBinding

class RegisterActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding
    lateinit var viewModel: RegisterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        viewBinding.vm = viewModel
        viewBinding.backArrow.setOnClickListener {
            finish()
        }


    }
}