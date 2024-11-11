package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView

class Supprimier : AppCompatActivity(){
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.supprmier)
        val backSupp = findViewById<TextView>(R.id.backSupp)
        val pulseAnimation = AnimationUtils.loadAnimation(this, R.anim.pluser)
        backSupp.startAnimation(pulseAnimation)
        registerForContextMenu(backSupp)

        backSupp.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}