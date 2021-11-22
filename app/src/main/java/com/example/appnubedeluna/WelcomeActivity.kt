package com.example.appnubedeluna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val fab : View = findViewById(R.id.fab)
        fab.setOnClickListener {
            view -> Snackbar.make(view, R.string.txt_fab, Snackbar.LENGTH_LONG)
            .setAction("Action", null)
            .show()
        }
    }
}