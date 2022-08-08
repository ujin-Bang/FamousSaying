package com.restart.famoussaying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.restart.famoussaying.adapters.QuotesPagerAdapter
import com.restart.famoussaying.data.Quote
import java.util.*

class MainActivity : AppCompatActivity() {

    private val viewPager: ViewPager2 by lazy {
        findViewById(R.id.viewPager)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        viewPager.adapter = QuotesPagerAdapter(
            listOf(
                Quote("나는 생각한다. 고로나느 존재한다.", "데카르트")
            )
        )
    }

}