package com.example.menu

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val pulseAnimation = AnimationUtils.loadAnimation(this, R.anim.pluser)
        textView.startAnimation(pulseAnimation)
        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if (menu != null) {
            menuInflater.inflate(R.menu.menu, menu)
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.Ajouter -> {
                intent = Intent(this,Ajouter::class.java)
                startActivity(intent)
                true
            }
            R.id.Supprimir -> {
                intent = Intent(this,Supprimier::class.java)
                startActivity(intent)
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}
