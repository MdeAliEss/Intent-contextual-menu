package com.example.menu

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.content.Intent

class Ajouter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ajouter)
        val Ajouter = findViewById<TextView>(R.id.backAjou)
        val pulseAnimation = AnimationUtils.loadAnimation(this, R.anim.pluser)
        Ajouter.startAnimation(pulseAnimation)
        registerForContextMenu(Ajouter)

        Ajouter.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}
