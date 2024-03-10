package com.example.test02_xml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerListAdapter(private val contacts: List<Contact>):
    RecyclerView.Adapter<RecyclerListAdapter.TitleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_title, parent, false)
        return TitleViewHolder(view)
    }

    override fun onBindViewHolder(holder: TitleViewHolder, position: Int){
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return 10
    }



    class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactPhoto: ImageView = itemView.findViewById(R.id.contactPhoto)
        val contactName: TextView = itemView.findViewById(R.id.contactName)
        val contactPhone: TextView = itemView.findViewById(R.id.contactPhone)

        fun bind(contact: Contact) {
            contactPhoto.id = contact.photo
            contactName.text = contact.name
            contactPhone.text = contact.phone
        }
    }
}