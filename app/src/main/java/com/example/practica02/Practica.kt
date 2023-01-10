package com.example.practica02

import android.app.Application
//Aplication permite ejecutar logica antes de ir a la activity main
class Practica: Application() {

    companion object{
       lateinit var prefs: Prefs
    }

    override fun onCreate(){
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}