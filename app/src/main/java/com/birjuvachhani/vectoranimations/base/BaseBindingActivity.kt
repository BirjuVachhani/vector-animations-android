package com.birjuvachhani.vectoranimations.base

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseBindingActivity<B : ViewDataBinding> : BaseActivity() {

    protected lateinit var mBinding: B

    override fun setActivityView() {
        mBinding = DataBindingUtil.setContentView(this, getLayout())
    }
}