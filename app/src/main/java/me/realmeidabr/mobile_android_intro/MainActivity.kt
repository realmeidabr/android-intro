package me.realmeidabr.mobile_android_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get element views by ID
        val etUserInput = findViewById<EditText>(R.id.etUserInput)
        val btSend = findViewById<Button>(R.id.btSend)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        // New code block for click listener
        btSend.setOnClickListener {
            /*if (tvResult.text == "Hello Gorgeous!") {
                tvResult.text = "Hello Stranger!"
            } else {
                tvResult.text = "Hello Gorgeous!"
            }*/
            if (etUserInput.text.isEmpty()) {
                etUserInput.error = "This field is required!"
            } else {
                tvResult.text = etUserInput.text.toString()
                etUserInput.text = null
            }
        }
    }
}