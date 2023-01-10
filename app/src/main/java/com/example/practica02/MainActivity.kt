package com.example.practica02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica02.Practica.Companion.prefs
import com.example.practica02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        checkUserValues()
        initUI()
    }

    private fun checkUserValues(){
        if(prefs.getName().isNotEmpty()){
            goToDeail()
        }
    }

    private fun initUI(){
        binding.button.setOnClickListener{accessToDetail()}
    }

    private fun goToDeail(){
        startActivity(Intent(this,ResultActivity::class.java))
    }

    private fun accessToDetail(){
        if(binding.editTextName.text.toString().isNotEmpty()){
            prefs.saveName(binding.editTextName.text.toString())
            prefs.saveVip(binding.checkBox.isChecked)
            goToDeail()
        }
    }
}