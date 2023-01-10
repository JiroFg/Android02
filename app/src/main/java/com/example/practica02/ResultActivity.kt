package com.example.practica02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.practica02.Practica.Companion.prefs
import com.example.practica02.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI(){
        val name = prefs.getName()
        binding.logoutButton.setOnClickListener{
            prefs.wipe()
            finish()
        }
        binding.textViewName.text = "Bienvenido $name"
        if(prefs.getVip()){
            binding.container.setBackgroundColor(ContextCompat.getColor(this,R.color.yellow))
        }
    }
}