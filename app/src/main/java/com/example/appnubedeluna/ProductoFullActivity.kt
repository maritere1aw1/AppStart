package com.example.appnubedeluna

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class ProductoFullActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto_full)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.setIcon(R.mipmap.ic_launcher)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_welcome_activity,menu)
        return super.onCreateOptionsMenu(menu)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_return -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}