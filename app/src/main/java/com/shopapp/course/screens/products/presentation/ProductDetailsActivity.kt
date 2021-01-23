package com.shopapp.course.screens.products.presentation

import android.graphics.Paint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shopapp.course.databinding.ActivityProductDetailsBinding
import com.shopapp.course.helpers.validateActionBar

class ProductDetailsActivity : AppCompatActivity() {
    lateinit var binding:ActivityProductDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        validateActionBar("Black top")
        binding.priceTvBefore.paintFlags = binding.priceTvBefore.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

    }
}