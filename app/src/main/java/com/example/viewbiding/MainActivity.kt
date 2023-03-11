package com.example.viewbiding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbiding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textoholamundo.text = "PELICULAS FAVORITAS"

    }

    fun cambiarSiguientePantalla(view: View) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
    fun cambiarPantalla2(view: View) {
        val intent = Intent(this, DetailActivity2::class.java)
        startActivity(intent)
    }
    fun cambiarPantalla3(view: View) {
        val intent = Intent(this, pantalla3::class.java)
        startActivity(intent)
    }
    fun cambiarPantalla4(view: View) {
        val intent = Intent(this, pantalla4::class.java)
        startActivity(intent)
    }
}