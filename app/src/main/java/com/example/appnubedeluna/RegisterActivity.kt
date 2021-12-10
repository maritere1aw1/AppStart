package com.example.appnubedeluna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    private var editUserName: EditText? = null
    private var editPassword: EditText? = null
    private var editName: EditText? = null
    private var editLastName: EditText? = null
    private var editMobile: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);
        editName = findViewById(R.id.editName);
        editLastName = findViewById(R.id.editLastName);
        editMobile = findViewById(R.id.editMobile);


        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.setIcon(R.mipmap.ic_launcher)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_register_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun ontextview(view: android.view.View) {

    }
    fun onReturn(view: android.view.View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


    fun onRegister(view: android.view.View) {}
    fun onTerms(view: android.view.View) {}



}