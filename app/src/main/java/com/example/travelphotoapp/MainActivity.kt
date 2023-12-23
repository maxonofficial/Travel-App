package com.example.travelphotoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    var currentImage = 0

    lateinit  var image : ImageView

    val touristPlaces = arrayOf("The India Gate", "The Lotus Temple", "Taj Mahal", "Qutub Minar", "The Humayun’s Tomb" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var placeName: TextView = findViewById(R.id.tvPlace)

        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val next = findViewById<ImageButton>(R.id.btnNext)

        prev.setOnClickListener {
            // get the previous Image
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            currentImage = (5 + currentImage - 1) % 5

            val idPrevImageString = "pic$currentImage"
            val idPrevImageInt = this.resources.getIdentifier(idPrevImageString,"id",packageName)
            image = findViewById(idPrevImageInt)
            image.alpha = 1f
            placeName.setText(touristPlaces[currentImage])
        }

        next.setOnClickListener {
            // get the next Image
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            currentImage = (5 + currentImage + 1) % 5

            val idPrevImageString = "pic$currentImage"
            val idPrevImageInt = this.resources.getIdentifier(idPrevImageString,"id",packageName)
            image = findViewById(idPrevImageInt)
            image.alpha = 1f
            placeName.setText(touristPlaces[currentImage])

        }
    }


}