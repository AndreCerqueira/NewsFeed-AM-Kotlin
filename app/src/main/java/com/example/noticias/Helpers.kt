package com.example.noticias

import android.graphics.BitmapFactory
import android.widget.ImageView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL

object Helpers {

    fun getImageUrl(url: String, imageView: ImageView) {

        GlobalScope.launch(Dispatchers.IO) {

            try {
                val input = URL(url).openStream()
                val bitmap = BitmapFactory.decodeStream(input)

                GlobalScope.launch(Dispatchers.Main) {
                    imageView.setImageBitmap(bitmap)
                }

            } catch (e: Exception){

                GlobalScope.launch(Dispatchers.Main) {
                    imageView.setImageResource(R.mipmap.icon_article)
                }

            }

        }
    }
}