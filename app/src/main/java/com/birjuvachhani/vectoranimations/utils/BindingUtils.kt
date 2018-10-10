package com.birjuvachhani.vectoranimations.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:imageRes")
fun setImageUrl(view: ImageView, resource: Int) {
    view.setImageResource(resource)
}

