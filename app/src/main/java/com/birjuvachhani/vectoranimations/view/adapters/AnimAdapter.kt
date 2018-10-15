package com.birjuvachhani.vectoranimations.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.birjuvachhani.vectoranimations.R
import com.birjuvachhani.vectoranimations.databinding.AnimItemBinding
import com.birjuvachhani.vectoranimations.model.VectorModel
import com.birjuvachhani.vectoranimations.view.viewholders.VectorViewHolder


class AnimAdapter(var listener: ItemClickListener) : RecyclerView.Adapter<VectorViewHolder>() {
    var animList = ArrayList<VectorModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VectorViewHolder {
        val mBinding = DataBindingUtil.inflate<AnimItemBinding>(LayoutInflater.from(parent.context), R.layout.item_anim, parent, false)
        return VectorViewHolder(mBinding)
    }

    override fun getItemCount(): Int {
        return animList.size
    }

    override fun onBindViewHolder(holder: VectorViewHolder, position: Int) {
        holder.mBinding.item = animList[position]
        holder.mBinding.executePendingBindings()
        holder.mBinding.root.setOnClickListener {
            listener.onItemClick(animList[holder.adapterPosition])
        }
    }

    fun setList(animList: ArrayList<VectorModel>) {
        this.animList = animList
        notifyDataSetChanged()
    }

    interface ItemClickListener {
        fun onItemClick(vectorModel: VectorModel)
    }
}