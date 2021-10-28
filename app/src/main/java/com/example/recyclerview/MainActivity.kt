package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val theSmithsList = listOf<TheSmiths>(
            TheSmiths(
                R.drawable.morrissey,
                nameTheSmiths = "Morrissey",
                descTheSmiths = "Vokalis The Smiths"
            ),
            TheSmiths(
                R.drawable.johnnymarr,
                nameTheSmiths = "Johnny Marr",
                descTheSmiths = "Gitaris The Smiths"
            ),
            TheSmiths(
                R.drawable.andyrourke,
                nameTheSmiths = "Andy Rourke",
                descTheSmiths = "Bassis The Smiths"
            ),
            TheSmiths(
                R.drawable.mikejoyce,
                nameTheSmiths = "Mike Joyce",
                descTheSmiths = "Drummer The Smiths"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_TheSmiths)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = TheSmithsAdapter(this, theSmithsList){
            val intent = Intent (this, DetailTheSmithsActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}