package com.ulalala.commonlistadapter.viewholder

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ulalala.commonlistadapter.data.ViewItem
import com.ulalala.commonlistadapter.data.ViewObject
import com.ulalala.commonlistadapter.databinding.ItemOneImageBinding

class OneImageViewHolder(
    private val binding: ItemOneImageBinding
    ) : CommonViewHolder(binding) {
        override fun bind(item: ViewObject) {
            val imageVo = item.imageVO!!
            Glide.with(binding.root)
                .load(imageVo.url)
                .override(imageVo.width, imageVo.height)
                .into(binding.image)
    }
}

