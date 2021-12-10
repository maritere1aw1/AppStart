package com.example.appnubedeluna
import android.content.ClipData.newIntent
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        setSupportActionBar(findViewById(R.id.my_toolbar))



        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.setIcon(R.mipmap.ic_launcher)

    }
    fun onClick(view: View?) {


    }

    fun onbtn1(view: android.view.View) {
        val miIntent = Intent(this, ProductoExtActivity::class.java)
        startActivity(miIntent)
    }
    fun onbtn2(view: android.view.View) {
        val miIntent = Intent(this, ProductoFullActivity::class.java)
        startActivity(miIntent)

    }
    fun onbtn3(view: android.view.View) {
        val miIntent = Intent(this, ProductoSingleActivity::class.java)
        startActivity(miIntent)   }


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



        

        

