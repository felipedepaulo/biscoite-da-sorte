package com.anydigital.biscoitodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anydigital.biscoitodasorte.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var lastRowNumber = -1

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.buttonNextPhrase.setOnClickListener {
            showPhrase()
        }
    }

    private fun showPhrase() {

        val phrases = resources.getStringArray(R.array.arrayPhrases)
        val random = Random.nextInt(phrases.size)
        val phrase = phrases[random]

        if (random != lastRowNumber){
            binding.labelPhrase.text = phrase
        }else{
            showPhrase()
        }


    }
}