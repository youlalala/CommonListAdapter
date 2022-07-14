package com.ulalala.commonlistadapter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.ulalala.commonlistadapter.data.UIResponse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()
        val json = assets.open("a.json").reader()
        val response = gson.fromJson(json, UIResponse::class.java)
        Log.i("youla : response",response.toString())
        val adapter = CommonAdapter(response.viewItems)

    }
}