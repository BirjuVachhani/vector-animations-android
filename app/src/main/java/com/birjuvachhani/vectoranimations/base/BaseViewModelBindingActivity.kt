package com.birjuvachhani.vectoranimations.base

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

abstract class BaseViewModelBindingActivity<V : ViewModel, B : ViewDataBinding> : BaseBindingActivity<B>() {

    lateinit var mViewModel: V

    abstract fun getViewModel(): Class<V>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(getViewModel())
    }
}