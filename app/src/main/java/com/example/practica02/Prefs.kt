package com.example.practica02
import android.content.Context

class Prefs(private val context: Context){
    private val SHARED = "data"
    private val SHARED_USER_NAME = "username"
    private val SHARED_USER_VIP = "vip"
    private val storage = context.getSharedPreferences(SHARED,0)

    fun saveName(name:String){
        storage.edit().putString(SHARED_USER_NAME, name).apply()
    }

    fun saveVip(vip:Boolean){
        storage.edit().putBoolean(SHARED_USER_VIP, vip).apply()
    }

    fun getName():String{
        return storage.getString(SHARED_USER_NAME,"")!!
    }

    fun getVip():Boolean{
        return storage.getBoolean(SHARED_USER_VIP,false)
    }

    fun wipe(){
        storage.edit().clear().apply()
    }

}