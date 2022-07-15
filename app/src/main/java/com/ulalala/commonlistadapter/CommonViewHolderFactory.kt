package com.ulalala.commonlistadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ulalala.commonlistadapter.databinding.ItemOneImageBinding
import com.ulalala.commonlistadapter.databinding.ItemOneLineBinding
import com.ulalala.commonlistadapter.databinding.ItemTwoLineBinding
import com.ulalala.commonlistadapter.viewholder.CommonViewHolder
import com.ulalala.commonlistadapter.viewholder.OneImageViewHolder
import com.ulalala.commonlistadapter.viewholder.OneLineViewHolder
import com.ulalala.commonlistadapter.viewholder.TwoLineViewHolder

object CommonViewHolderFactory {
    fun createViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder{
        return when (viewType){
            ViewType.ONE_LINE_TEXT.ordinal -> OneLineViewHolder(ItemOneLineBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            ViewType.TWO_LINE_TEXT.ordinal -> TwoLineViewHolder(ItemTwoLineBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            ViewType.ONE_IMAGE.ordinal -> OneImageViewHolder(ItemOneImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            else -> throw IllegalArgumentException("Unknown view type")
        }
    }
}
