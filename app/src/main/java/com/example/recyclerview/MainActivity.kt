package com.example.recyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.Myadapter
import com.example.recyclerview.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView =
            findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerview)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val userDataList = Dummydata()
        val adapter = Myadapter(this,userDataList)
        recyclerView.adapter = adapter
    }

    private fun Dummydata(): List<User> {
        val userList = mutableListOf<User>()
        userList.add(User("Amit", R.drawable.image1, "46846453464"))
        userList.add(User("Amit", R.drawable.image2, "46846453464"))
        userList.add(User("Amit", R.drawable.image3, "46846453464"))
        userList.add(User("Amit", R.drawable.image4, "46846453464"))
        userList.add(User("Amit", R.drawable.image5, "46846453464"))
        userList.add(User("Amit", R.drawable.image6, "46846453464"))
        userList.add(User("Amit", R.drawable.image7, "46846453464"))
        userList.add(User("Amit", R.drawable.image8, "46846453464"))
        userList.add(User("Amit", R.drawable.image9, "46846453464"))
        userList.add(User("Amit", R.drawable.image10, "46846453464"))
        return userList

    }
}


