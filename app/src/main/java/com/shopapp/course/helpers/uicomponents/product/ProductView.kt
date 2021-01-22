package com.shopapp.course.helpers.uicomponents.product

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.shopapp.course.R
import com.shopapp.course.databinding.ProductViewBinding
import com.shopapp.course.helpers.loadImage


class ProductView : ConstraintLayout {
    private lateinit var binding: ProductViewBinding

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {

        init(context)

    }

    private fun init(context: Context) {
        binding = ProductViewBinding.bind(View.inflate(context, R.layout.product_view, this))
    }

    fun setCover(res: Any) {
        binding.cover.loadImage(res)
    }

    fun setTitle(text: String) {
        binding.titleTv.text = text
    }

    fun setPrice(text: String) {
        binding.priceTv.text = text
    }
}