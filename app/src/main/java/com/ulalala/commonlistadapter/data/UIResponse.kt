package com.ulalala.commonlistadapter.data

data class UIResponse(
    val viewItems: ArrayList<ViewItems>
)


data class ViewItems(
    val viewType: String,
    val viewObejct: ViewObejct?
)

data class ViewObejct(
    val titleText: String?,
    val descText: String?,
    val imageVO: ImageVO?
)

data class ImageVO(
    val url: String?,
    val width: Int?,
    val height: Int?
)
