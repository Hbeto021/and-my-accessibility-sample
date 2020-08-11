package com.example.and_my_accessibility_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.and_my_accessibility_sampsle.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Tela inicial"
        initListeners()
    }

    private fun initListeners() {
        btnBrazil.setOnClickListener {
            startActivity(getIntent(AppConstants.BRAZIL))
        }
        btnFrance.setOnClickListener {
            startActivity(getIntent(AppConstants.FRANCE))
        }
    }

    private fun getIntent(country: String) =
        Intent(this, DetailsActivity::class.java).apply {
            putExtra(AppConstants.COUNTRY, country)
        }
}