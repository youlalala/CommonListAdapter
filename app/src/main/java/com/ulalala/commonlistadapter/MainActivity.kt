package com.ulalala.commonlistadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.google.gson.Gson
import com.ulalala.commonlistadapter.adapter.CommonAdapter
import com.ulalala.commonlistadapter.data.UIResponse
import com.ulalala.commonlistadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val gson = Gson()
        var json = assets.open("a.json").reader()
        var response = gson.fromJson(json, UIResponse::class.java)
        var adapter = CommonAdapter(response.viewItems)
        binding.recyclerView.adapter = adapter
        binding.aBtn.setOnClickListener{
            json = assets.open("a.json").reader()
            response = gson.fromJson(json, UIResponse::class.java)
            adapter = CommonAdapter(response.viewItems)
            binding.recyclerView.adapter = adapter
        }
        binding.bBtn.setOnClickListener{
            json = assets.open("b.json").reader()
            response = gson.fromJson(json, UIResponse::class.java)
            adapter = CommonAdapter(response.viewItems)
            binding.recyclerView.adapter = adapter
        }
        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
    }
}