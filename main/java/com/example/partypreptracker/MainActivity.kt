package com.example.partypreptracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtTotal: TextView
    private lateinit var btnAdd: Button
    private lateinit var btnView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtTotal = findViewById(R.id.txtTotal)
        btnAdd = findViewById(R.id.btnAdd)
        btnView = findViewById(R.id.btnView)

        txtTotal.text = "Total Items:${DataManager.getTotalItems()}"

        btnAdd.setOnClickListener {
            startActivity(Intent(this, AddItemAvtivity::class.java))
        }
        btnView.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }

    overide
    fun onResume() {

        super.onResume()
        txtTotal.text = "Total Items:${DataManager.getTotalItems()}"
    }
}