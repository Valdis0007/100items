package com.example.a100items

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    // Using ArrayList to store images data
    private val courseImg = arrayListOf(
        R.drawable.data_structure, R.drawable.c_plus_plus,
        R.drawable.c_hash, R.drawable.javascript,
        R.drawable.java, R.drawable.c,
        R.drawable.html, R.drawable.css, R.drawable.data_structure, R.drawable.c_plus_plus,
        R.drawable.c_hash, R.drawable.javascript,
        R.drawable.java, R.drawable.c,
        R.drawable.html
    )
    private val courseName = arrayListOf(
        "Data Structure", "C++", "C#", "JavaScript", "Java",
        "C-Language", "HTML 5", "CSS","1","2","3","4","5","6","7","8"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting reference of recyclerView
        recyclerView = findViewById(R.id.recyclerView)

        // Setting the layout as linear layout for vertical orientation
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = linearLayoutManager

        // Sending reference and data to Adapter
        val adapter = Adapter(this, courseImg, courseName)

        // Setting Adapter to RecyclerView
        recyclerView.adapter = adapter
    }
}

