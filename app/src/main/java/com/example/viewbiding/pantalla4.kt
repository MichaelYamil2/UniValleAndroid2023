package com.example.viewbiding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.viewbiding.databinding.ActivityPantalla4Binding

class pantalla4 : AppCompatActivity() {
    private lateinit var binding: ActivityPantalla4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPantalla4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrar4(view: View) {
        finish()
    }
}