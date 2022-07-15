package com.ulalala.commonlistadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ulalala.commonlistadapter.data.ViewItem
import com.ulalala.commonlistadapter.databinding.ItemOneImageBinding
import com.ulalala.commonlistadapter.databinding.ItemOneLineBinding
import com.ulalala.commonlistadapter.databinding.ItemTwoLineBinding
import com.ulalala.commonlistadapter.viewholder.CommonViewHolder
import com.ulalala.commonlistadapter.viewholder.OneImageViewHolder
import com.ulalala.commonlistadapter.viewholder.OneLineViewHolder
import com.ulalala.commonlistadapter.viewholder.TwoLineViewHolder

class CommonAdapter(
   private val viewItemList: ArrayList<ViewItem>
):RecyclerView.Adapter<CommonViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return when(viewItemList[position].viewType){
            "ONE_LINE_TEXT" -> ViewType.ONE_LINE_TEXT.ordinal
            "TWO_LINE_TEXT" -> ViewType.TWO_LINE_TEXT.ordinal
            "ONE_IMAGE" -> ViewType.ONE_IMAGE.ordinal
            else -> 9
        }
    }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
         return when (viewType){
            0 -> OneLineViewHolder(ItemOneLineBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            1 -> TwoLineViewHolder(ItemTwoLineBinding.inflate(LayoutInflater.from(parent.context), parent, false))
             2 -> OneImageViewHolder(ItemOneImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            else -> throw IllegalArgumentException("Unknown view type")
         }
   }

    override fun getItemCount(): Int {
        return viewItemList.size
    }
   override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.bind(viewItemList[position].viewObject)
      }
   }

