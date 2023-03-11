package com.example.viewbiding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbiding.databinding.ActivityDetail2Binding


class DetailActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityDetail2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetail2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrar2(view: View) {
        finish()
    }
}