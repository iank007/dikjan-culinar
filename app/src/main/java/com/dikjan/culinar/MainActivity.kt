package com.dikjan.culinar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dikjan.culinar.ordering.OrderingActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnOrder = findViewById(R.id.btnOrder) as Button
        btnOrder.setOnClickListener {
            startActivity(Intent(this@MainActivity,OrderingActivity::class.java))
        }
    }
}