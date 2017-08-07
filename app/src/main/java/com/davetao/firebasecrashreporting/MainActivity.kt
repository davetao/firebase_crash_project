package com.davetao.firebasecrashreporting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            throw Exception("Random crash")
        }
        catch(e: Exception) {
            e.printStackTrace()
        }
    }
}
