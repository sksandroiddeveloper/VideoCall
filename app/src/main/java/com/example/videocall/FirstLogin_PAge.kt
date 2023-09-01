package com.example.videocall

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.videocall.databinding.ActivityFirstLoginPageBinding

class FirstLogin_PAge : AppCompatActivity() {
private lateinit var binding: ActivityFirstLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = Html.fromHtml("<font color=${Color.BLACK}>Video</font>" +" "+
              "<font color=${Color.BLACK}>Call</font>")
    }
}