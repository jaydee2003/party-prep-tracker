package com.example.partypreptracker

import android.R.attr.category
import android.R.attr.name
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private val AddItemActivity.quantityText: Any

class AddItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_item)

        val etItemName = findViewById<EditText>(R.id.etItemName)
        val etCategory = findViewById<EditText>(R.id.etCategory)
        val etQuantity = findViewById<EditText>(R.id.etQuantity)
        val etComments = findViewById<EditText>(R.id.Comments)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {

            val name = etItemName.text.toString().trim()
            val category = etCategory.text.toString().trim()
            val quantityText = etQuantity.text.toString().trim()
            val comments = etComments.text.toString().trim()

            if (name.isEmpty() ||
                category.isEmpty() ||
                quantityText.isEmpty() ||
                comments.isEmpty()
            ) {
            }
            Toast.makeText(this"Please fill in all fields", Toast.Length_Short)
                .show()
            return@setOnClickListener
        }
        val quantity = quantityText.toInt()

        DataManager.addItem(
            name,
            category,
            quantity,
            comments
        )

        Toast.makeText(
            this
            "Item Added Successfully!",
            Toast.LENGTH_SHORT
        ).show()

        finish()
    }
