package com.example.quotes3.presentation.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.quotes3.databinding.ActivityMainBinding
import com.example.quotes3.presentation.viewmodel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //----------------------------
        quoteViewModel.randomQuote()
        observer()
        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }

    }
    private fun observer(){
        lifecycleScope.launch {
            quoteViewModel.quoteModel.collect {
                binding.tvQuote.text = it.quote
                binding.tvAuthor.text= it.author
            }
        }
    }


}
