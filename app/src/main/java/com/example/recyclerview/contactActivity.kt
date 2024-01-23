package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class contactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        val username = findViewById<TextView>(R.id.userNames)
        val userContactNumber = findViewById<TextView>(R.id.contactNumbers)
        val userProfile = findViewById<ImageView>(R.id.userProfiles)

        val name = intent.getStringExtra("name")
        val userContact  = intent.getStringExtra("contact")
        val Profile = intent.getIntExtra("profile",R.drawable.image4)
        username.text = name
        userContactNumber.text  = userContact
        userProfile.setImageResource(Profile)

    }
}