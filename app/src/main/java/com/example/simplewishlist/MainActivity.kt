package com.example.simplewishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.app.Activity
import android.graphics.Color
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast

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

        val submitButton = findViewById<Button>(R.id.submitButtonBt)
        submitButton.setOnClickListener {

            // Initialize variables.
            var newItemName: String
            var newItemNameInput: TextView
            var newItemUrl: String
            var newItemUrlInput: TextView
            var newItemPrice: String
            var newItemPriceInput: TextView

            // Get input from EditText(s) and assign to variables.
            newItemNameInput = findViewById(R.id.itemNameEt)
            newItemName = newItemNameInput.text.toString()
            newItemUrlInput = findViewById(R.id.itemUrlEt)
            newItemUrl = newItemUrlInput.text.toString()
            newItemPriceInput = findViewById(R.id.itemPriceEt)
            newItemPrice = newItemPriceInput.text.toString()

            Log.i("Daniel", newItemName)
            Log.i("Daniel", newItemUrl)
            Log.i("Daniel", newItemPrice)



            // Reset EditText input fields
            newItemNameInput.text = ""
            newItemPriceInput.text = ""
            newItemUrlInput.text = ""

            // To close keyboard.
            val view = currentFocus
            if (view != null) {
                view.clearFocus()
                val inputMethodManager =
                    getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(
                    view.windowToken,
                    InputMethodManager.HIDE_NOT_ALWAYS
                )
            }

        }

    }
}