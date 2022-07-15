package com.ulalala.commonlistadapter.viewholder

import com.ulalala.commonlistadapter.data.ViewObject
import com.ulalala.commonlistadapter.databinding.ItemOneLineBinding

class OneLineViewHolder(
    private val binding: ItemOneLineBinding
) : CommonViewHolder(binding) {
    override fun bind(item: ViewObject) {
        binding.titleTv.text = item.titleText
    }
}
