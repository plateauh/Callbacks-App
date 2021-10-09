package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Activity 2", Toast.LENGTH_SHORT).show()
        Log.d("Second Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Activity 2", Toast.LENGTH_SHORT).show()
        Log.d("Second Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Activity 2", Toast.LENGTH_SHORT).show()
        Log.d("Second Activity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Activity 2", Toast.LENGTH_SHORT).show()
        Log.d("Second Activity", "onDestroy")
    }
}