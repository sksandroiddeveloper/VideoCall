package com.example.videocall

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.videocall.databinding.ActivityFirstLoginPageBinding
import com.example.videocall.databinding.ActivityLogininAppBinding

private lateinit var binding: ActivityLogininAppBinding
class LogininApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogininAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView11.text = Html.fromHtml("<font color=${Color.BLACK}>Don't have an account ?</font>" +" "+
                "<font color=${Color.BLUE}>Register</font>")

    }
}