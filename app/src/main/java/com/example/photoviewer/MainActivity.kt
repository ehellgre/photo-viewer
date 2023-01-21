package com.example.photoviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize photos
        var imageView: ImageView
        var img = 0
        val images = listOf(
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3
        )


        imageView = findViewById(R.id.imageView)
        val next = findViewById<Button>(R.id.next)
        next.text = getString(R.string.next_button_txt)
        val previous = findViewById<Button>(R.id.previous)
        previous.text = getString(R.string.previous_button_txt)


        // Sets the the first image in the list (given value of 0 at the start)
        imageView.setImageResource(images[img])

        // Next button
        next.setOnClickListener {   // Click
            if (img < images.size - 1) {    // Checks if current image is not the last image in images list
                img++
                imageView.setImageResource(images[img])
            }
        }

        // Previous button
        previous.setOnClickListener {   // Click
            if (img > 0) { // Checks if the image displayed is not the first image in the images list
                img--
                imageView.setImageResource(images[img])
            }
        }


    }
}