package com.example.partypreptracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val txtItems = findViewById<TextView>(R.id.txtItems)
        val btnBack = findViewById<Button>(R.id.btnBack)

        var output = ""

        for (i in DataManager.itemNames.indices) {
            output += "Item: ${DataManager.itemNames[i]}\n"
            output += "Category: ${DataManager.categories[i]}\n"
            output += "Quantity: ${DataManager.quantities[i]}\n"
            output += "Comments: ${DataManager.comments[i]}\n"
            output += "__________________________\n\n"
        }
        
        txtItems.text = output

        btnBack.setOnClickListener {
            finish()
        }
    }
}