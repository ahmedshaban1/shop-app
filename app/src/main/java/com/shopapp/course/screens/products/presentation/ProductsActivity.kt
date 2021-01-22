package com.shopapp.course.screens.products.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.shopapp.course.R
import com.shopapp.course.helpers.openActivity

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        findViewById<View>(R.id.root).setOnClickListener{
            openActivity(ProductDetailsActivity::class.java)
        }
    }
}