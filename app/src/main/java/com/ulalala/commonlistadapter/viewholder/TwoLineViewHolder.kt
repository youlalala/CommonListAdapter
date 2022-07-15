package com.ulalala.commonlistadapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.ulalala.commonlistadapter.data.ViewItem
import com.ulalala.commonlistadapter.data.ViewObject
import com.ulalala.commonlistadapter.databinding.ItemOneLineBinding
import com.ulalala.commonlistadapter.databinding.ItemTwoLineBinding

class TwoLineViewHolder (
    private val binding: ItemTwoLineBinding
) : CommonViewHolder(binding) {
    override fun bind(item: ViewObject) {
        binding.titleTv.text = item.titleText
        binding.descTv.text = item.descText
    }
}