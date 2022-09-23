package com.example.simplewishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var items: List<Item>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val itemsRv = findViewById<RecyclerView>(R.id.itemsRv)
        // Fetch the list of emails
        items = ItemFetcher.getItems()
        // Create adapter passing in the list of emails
        val adapter = ItemAdapter(items)
        // Attach the adapter to the RecyclerView to populate items
        itemsRv.adapter = adapter
        // Set layout manager to position the items
        itemsRv.layoutManager = LinearLayoutManager(this)


    }
}