package com.example.partypreptracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : A{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val txtItems = findViewById<TextView>(R.id.txtItems)
        val btnback = findViewById<Button>(R.id.btnBack)

        var output = ""

        for (i in DataManager.itemNames.indices) {
        }

        output += "Item:${DataManager.itemNames[i]\n}"
        output += "category:${DataManager.itemNames[i]\n}"
        output += "Quantity:${DataManager.itemNames[i]\n}"
        output += "Comments:${DataManager.itemNames[i]\n}"
        output += "__________________________\n\n"
    }
    txtItems.text = output

    btnBack.setOnclickListener{
    finish()
}