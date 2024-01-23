package com.example.recyclerview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.contactActivity
import com.example.recyclerview.model.User

class Myadapter(private val context: Context,private val userData: List<User>) :
    RecyclerView.Adapter<Myadapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(userData[position])

        holder.itemView.setOnClickListener {
            val intent = Intent(context,contactActivity::class.java)
            intent.putExtra("name",userData[position].userName)
            intent.putExtra("profile",userData[position].userProfile)
            intent.putExtra("contact",userData[position].userContact)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = userData.size
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            val profileImage = itemView.findViewById<ImageView>(R.id.contact_image)
            val name = itemView.findViewById<TextView>(R.id.contact_name)
            val contact = itemView.findViewById<TextView>(R.id.phone)


            profileImage.setImageResource(user.userProfile)
            name.text = user.userName
            contact.text = user.userContact
        }
    }
}