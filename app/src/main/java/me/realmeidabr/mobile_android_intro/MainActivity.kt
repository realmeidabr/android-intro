package me.realmeidabr.mobile_android_intro

import android.content.Intent
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

            if (etUserInput.text.isBlank()) {
                etUserInput.error = getString(R.string.field_required)
            } else {
                tvResult.text = etUserInput.text.toString()
                etUserInput.text = null
            }
        }

        val btOpen = findViewById<Button>(R.id.btOpen)

        btOpen.setOnClickListener {
            val newScreenIntent = Intent(this, ResultActivity::class.java)
            val typedName = tvResult.text //.toString()
            newScreenIntent.putExtra("TYPED_NAME", typedName)
            startActivity(newScreenIntent)
        }
    }
}