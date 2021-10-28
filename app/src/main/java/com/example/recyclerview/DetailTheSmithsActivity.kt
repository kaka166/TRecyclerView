package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailTheSmithsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_the_smiths)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val theSmiths = intent.getParcelableExtra<TheSmiths>(MainActivity.INTENT_PARCELABLE)

        val imgTheSmiths = findViewById<ImageView>(R.id.img_item_photo)
        val nameTheSmiths = findViewById<TextView>(R.id.tv_item_name)
        val descTheSmiths = findViewById<TextView>(R.id.tv_item_description)

        imgTheSmiths.setImageResource(theSmiths?.imgTheSmiths!!)
        nameTheSmiths.text = theSmiths.nameTheSmiths
        descTheSmiths.text = theSmiths.descTheSmiths
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}