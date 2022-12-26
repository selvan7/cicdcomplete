package com.example.cicdcomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext," *******Test7777777 Release Success!!! ", Toast.LENGTH_LONG).show()

        Log.d("Test7","Inside onCreate() method")
        Log.d("7777777","Inside onCreate() method")

    }

}