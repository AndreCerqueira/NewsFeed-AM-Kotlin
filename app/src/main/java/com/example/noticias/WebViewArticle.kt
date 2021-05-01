package com.example.noticias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import org.json.JSONObject

class WebViewArticle : AppCompatActivity() {

    // models
    var post: Post? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_article)

        title = post?.title

        val webView = findViewById<WebView>(R.id.webView)

        post?.url?.let {
            webView.loadUrl(it)
        }

    }

    companion object {
        const val EXTRA_ARTICLE = "article"
    }
}