package com.example.restapi

import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.video_row.view.*


  //  get() {}

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder> () {

    val videoTitles = listOf("First title", "Second", "3rd")

    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        // val videoTitle = videoTitles.get(position)
        val video = homeFeed.videos.get(position)
         holder?.view?.textView_Video_title?.text = video.idItem
       //holder?.view?.textView_Channel_name?.text = video.channel.name

       // val thumbnailImageView = holder?.view?.imageView_video_thumbnail
      //  Picasso.with(holder?.view?.context).load(video.imageUrl).into(thumbnailImageView)
     //   val channelProfileImageView = holder?.view?.imageView_Channel_profile
     //  Picasso.with(holder?.view?.context).load(video.channel.profileImageUrl).into(channelProfileImageView)

    }

}

class CustomViewHolder(val view: View):RecyclerView.ViewHolder(view) {


}