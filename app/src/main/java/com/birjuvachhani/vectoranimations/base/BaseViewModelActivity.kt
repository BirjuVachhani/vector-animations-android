package com.birjuvachhani.vectoranimations.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

abstract class BaseViewModelActivity<V : ViewModel> : AppCompatActivity() {

    protected lateinit var mViewModel: V

    @LayoutRes
    abstract fun getLayout(): Int

    abstract fun getViewModel(): Class<V>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(getViewModel())
    }
}