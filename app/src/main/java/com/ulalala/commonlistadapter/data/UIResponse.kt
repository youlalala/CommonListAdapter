package com.ulalala.commonlistadapter.data

data class UIResponse(
    val viewItems: ArrayList<ViewItem>
)


data class ViewItem(
    val viewType: String,
    val viewObject: ViewObject
)

data class ViewObject(
    val titleText: String?,
    val descText: String?,
    val imageVO: ImageVO?
)

data class ImageVO(
    val url: String,
    val width: Int,
    val height: Int
)
