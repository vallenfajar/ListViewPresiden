package com.example.listviewpresident

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpresident.adapter.ListPresidentAdapter
import com.example.listviewpresident.model.Presiden
import com.example.listviewpresident.model.PresidenData

class MainActivity : AppCompatActivity() {
    private lateinit var rvPresiden: RecyclerView
    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden= findViewById(R.id.rv_president)
        rvPresiden.setHasFixedSize(true)
        list.addAll(PresidenData.listPresident)
        showPresidentList()
    }

    private fun showPresidentList() {
        rvPresiden.layoutManager = LinearLayoutManager(this)
        val listPresidentAdapter = ListPresidentAdapter(list)
        rvPresiden.adapter = listPresidentAdapter
    }
}