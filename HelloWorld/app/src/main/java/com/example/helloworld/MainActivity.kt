package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main  (how the .kt and .xml files are connected)
        setContentView(R.layout.activity_main)

        // Display Customized text to show 'hello from {name}'
        // Change to a Custom background color

        // User can tap a button to change the color of the text/label
            // 1. Add a button to our layout

                // Get a reference to our button
                // 2. Set up logic to know when the user has tapped on the button
                findViewById<Button>(R.id.button).setOnClickListener {
                    // Handel button tap
                    Log.i("Sap", "Tapped on Button") // Shows tap on button if button is pressed on emulator on log cat if u search tag Sap
                    // 3. Change the color of the text
                        // Get a reference of the text view
                        // Set the color of the text view
                        findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
                }


    }
}