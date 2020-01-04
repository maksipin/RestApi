package com.example.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
     //   recyclerView_main.adapter = MainAdapter()

        fetchJson()
    }

    fun fetchJson() {

        println("Test")
        val url = "https://api.letsbuildthatapp.com/youtube/home_feed"
        val url2 = "http://queue.easymatic.su/en/v1/items"
        val request = Request.Builder().url(url2).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object: Callback {
             override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                println(body)
              //  val gson = GsonBuilder().create()
              //  val homeFeed = gson.fromJson(body, HomeFeed::class.java)

              //  println(homeFeed)
               //  test_Rest2.text = homeFeed.videos.toString()
              //  runOnUiThread(){
              //    recyclerView_main.adapter = MainAdapter(homeFeed)
              //  }
            }
            override fun onFailure(call: Call, e: IOException) {
                println("Failed")
            }

            })
    }
}
