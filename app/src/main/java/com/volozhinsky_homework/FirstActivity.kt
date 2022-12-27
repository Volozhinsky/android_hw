package com.volozhinsky_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }

    override fun onStop() {
        super.onStop()
        startActivity(SecondActivity.newIntent(this, "Передали строку"))
    }
}