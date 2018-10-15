package com.birjuvachhani.vectoranimations.view.activities

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.birjuvachhani.vectoranimations.R
import com.birjuvachhani.vectoranimations.base.BaseViewModelBindingActivity
import com.birjuvachhani.vectoranimations.databinding.ActivityMainBinding
import com.birjuvachhani.vectoranimations.model.DataProvider
import com.birjuvachhani.vectoranimations.model.VectorModel
import com.birjuvachhani.vectoranimations.utils.Constants
import com.birjuvachhani.vectoranimations.view.adapters.AnimAdapter
import com.birjuvachhani.vectoranimations.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseViewModelBindingActivity<MainActivityViewModel, ActivityMainBinding>(), AnimAdapter.ItemClickListener {
    lateinit var adapter: AnimAdapter
    override fun getViewModel(): Class<MainActivityViewModel> {
        return MainActivityViewModel::class.java
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = AnimAdapter(this)
        rvList.layoutManager = GridLayoutManager(this, 2)
        rvList.adapter = adapter
        adapter.setList(DataProvider.getDataList(this))
    }

    override fun onItemClick(vectorModel: VectorModel) {
        val intent = Intent(this, AnimationActivity::class.java)
        intent.putExtra(Constants.BUNDLE_KEY_ANIMATION, vectorModel)
        startActivity(intent)
    }

}

