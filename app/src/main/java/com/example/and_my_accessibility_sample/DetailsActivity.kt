package com.example.and_my_accessibility_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.and_my_accessibility_sampsle.R

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        when(intent.getStringExtra(AppConstants.COUNTRY)) {
            AppConstants.BRAZIL -> showFragment(BrazilFragment())
            AppConstants.FRANCE -> showFragment(FranceFragment())
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.details_frame, fragment)
            .commit()
    }
}