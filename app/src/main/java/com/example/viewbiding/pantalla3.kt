package com.example.viewbiding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbiding.databinding.ActivityPantalla3Binding

class pantalla3 : AppCompatActivity() {

    private lateinit var binding: ActivityPantalla3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPantalla3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrar3(view: View) {
        finish()

    }
}