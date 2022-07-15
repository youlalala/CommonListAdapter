package com.ulalala.commonlistadapter.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ulalala.commonlistadapter.CommonViewHolderFactory
import com.ulalala.commonlistadapter.ViewType
import com.ulalala.commonlistadapter.data.ViewItem
import com.ulalala.commonlistadapter.viewholder.CommonViewHolder

class CommonAdapter(
   private val viewItemList: ArrayList<ViewItem>
):RecyclerView.Adapter<CommonViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return ViewType.valueOf(viewItemList[position].viewType).ordinal
    }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
         return CommonViewHolderFactory.createViewHolder(parent, viewType)
   }

    override fun getItemCount(): Int {
        return viewItemList.size
    }
   override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.bind(viewItemList[position].viewObject)
      }
   }

