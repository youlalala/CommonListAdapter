package com.ulalala.commonlistadapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.ulalala.commonlistadapter.data.ViewObject
import com.ulalala.commonlistadapter.databinding.ItemOneLineBinding

abstract class CommonViewHolder(
    binding: ViewBinding
): RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(viewObject: ViewObject)


}
