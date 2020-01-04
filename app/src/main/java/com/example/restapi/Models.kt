package com.example.restapi

import android.provider.MediaStore

class HomeFeed (val videos: List<Video1>)

class Video(val id: Int, val name: String, val link: String, val imageUrl: String,
            val number0fViews: Int, val channel: Channel)

class Video1 (val idItem: String, val idQueue: Int, val idClient: Int, val Status: Int,
             val CreateDate: String, val StatusDate: String, val RestTime: Int, val Position: Int, val Comment: String)

class Channel (val name: String, val profileImageUrl: String)