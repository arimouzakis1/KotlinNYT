package com.example.kotlinnyt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        public val MAIN_ACTIVITY_EXTRA = "Article"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        article1.setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext, DetailActivity::class.java).apply {
                putExtra(MAIN_ACTIVITY_EXTRA, "I am displaying article 1")
            }
            startActivity(intent)
        })

        article2.setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext, DetailActivity::class.java).apply {
                putExtra(MAIN_ACTIVITY_EXTRA, "I am displaying article 2")
            }
            startActivity(intent)
        })
    }
}
