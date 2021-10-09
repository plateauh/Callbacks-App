package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navigateButton = findViewById<Button>(R.id.navigate_btn)
//        navigateButton.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//        }
        navigateButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?){
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Activity 1", Toast.LENGTH_SHORT).show()
        Log.d("First Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Activity 1", Toast.LENGTH_SHORT).show()
        Log.d("First Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Activity 1", Toast.LENGTH_SHORT).show()
        Log.d("First Activity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Activity 1", Toast.LENGTH_SHORT).show()
        Log.d("First Activity", "onDestroy")
    }
}

