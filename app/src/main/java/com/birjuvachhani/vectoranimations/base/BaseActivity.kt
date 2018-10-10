package com.birjuvachhani.vectoranimations.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    @LayoutRes
    abstract fun getLayout(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setActivityView()
    }

    open fun setActivityView() {
        setContentView(getLayout())
    }
}