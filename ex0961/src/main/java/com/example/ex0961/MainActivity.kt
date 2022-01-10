package com.example.ex0961

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.auto)

        // Spinner 준비
        val datas = resources.getStringArray(R.array.language)
        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            datas
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // AutoCompleteTextView 준비
        val autoDatas = arrayOf<String>("apply", "apple", "below")
        val autoAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_dropdown_item_1line,
            autoDatas
        )
        autoCompleteTextView.setAdapter(autoAdapter)
    }
}