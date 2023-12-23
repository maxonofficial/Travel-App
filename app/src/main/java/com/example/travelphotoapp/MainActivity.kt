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
    private var currentImage = 0

    private lateinit  var image : ImageView

    private val touristPlaces = arrayOf("The India Gate", "The Lotus Temple", "Taj Mahal", "Qutub Minar", "The Humayun’s Tomb" )
    private val drawableIds = arrayOf(
        R.drawable.pic0, R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val placeName: TextView = findViewById(R.id.tvPlace)

        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val next = findViewById<ImageButton>(R.id.btnNext)

        image = findViewById(R.id.pic)
        image.setImageResource(drawableIds[currentImage])
        placeName.text = touristPlaces[currentImage]

        prev.setOnClickListener {
            // get the previous Image
            currentImage = (5 + currentImage + 1) % 5
            image.setImageResource(drawableIds[currentImage])
            placeName.text = touristPlaces[currentImage]

        }

        next.setOnClickListener {
            // get the next Image
            currentImage = (5 + currentImage + 1) % 5
            image.setImageResource(drawableIds[currentImage])
            placeName.text = touristPlaces[currentImage]

        }
    }


}