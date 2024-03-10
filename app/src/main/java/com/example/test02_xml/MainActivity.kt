package com.example.test02_xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test02_xml.databinding.ActivityLsitBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityLsitBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLsitBinding.inflate(LayoutInflater.from(this))
        setContentView(binding!!.root)
        val list = mutableListOf<Contact>()
        repeat(10){
            list.add(
                Contact(
                    photo = R.drawable.icon,
                    name = "$it",
                    phone = "+7 000 0000"
                )
            )
        }
        val adapter = RecyclerListAdapter(list)
        binding?.let{
            it.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            it.rvList.adapter = adapter
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}