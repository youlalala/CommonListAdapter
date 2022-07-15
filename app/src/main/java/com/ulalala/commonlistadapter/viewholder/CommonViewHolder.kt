package com.ulalala.commonlistadapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.ulalala.commonlistadapter.data.ViewObject

abstract class CommonViewHolder(
    binding: ViewBinding
    ): RecyclerView.ViewHolder(binding.root) {
        abstract fun bind(viewObject: ViewObject)
    }
