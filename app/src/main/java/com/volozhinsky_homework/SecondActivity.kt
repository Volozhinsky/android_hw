package com.volozhinsky_homework

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val TEXT_EXTRA = "TEXT_EXTRA"
class SecondActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context,transferString: String):Intent{
            val intent = Intent(context,SecondActivity::class.java).apply {
                putExtra(TEXT_EXTRA, transferString)
            }
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val secondTextView = findViewById<TextView>(R.id.secondTextView)
        secondTextView.text = intent.getStringExtra(TEXT_EXTRA)
    }

}