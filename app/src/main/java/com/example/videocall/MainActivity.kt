package com.example.videocall

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView


class MainActivity : AppCompatActivity() {

    // declaring a null variable for VideoView
    var simpleVideoView: VideoView? = null

    // declaring a null variable for MediaController
    var mediaControls: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        simpleVideoView = findViewById<View>(R.id.simpleVideoView) as VideoView
//
//        if (mediaControls == null) {
//            // creating an object of media controller class
//            mediaControls = MediaController(this)
//
//            // set the anchor view for the video view
//            mediaControls!!.setAnchorView(this.simpleVideoView)
//        }
//
//        // set the media controller for video view
//        simpleVideoView!!.setMediaController(mediaControls)
//
//        // set the absolute path of the video file which is going to be played
//        simpleVideoView!!.setVideoURI(
//            (Uri.parse("android.resource://" + getPackageName() + "/" +
//                    R.raw.welcome))
//        )
//
//        simpleVideoView!!.requestFocus()
//
//        // starting the video
//        simpleVideoView!!.start()
//
//        // display a toast message
//        // after the video is completed
//        simpleVideoView!!.setOnCompletionListener {
//            Toast.makeText(
//                applicationContext, "Video completed",
//                Toast.LENGTH_LONG
//            ).show()
//            true
//        }
//
//        // display a toast message if any
//        // error occurs while playing the video
//        simpleVideoView!!.setOnErrorListener { mp, what, extra ->
//            Toast.makeText(
//                applicationContext, "An Error Occurred " +
//                        "While Playing Video !!!", Toast.LENGTH_LONG
//            ).show()
//            false
//        }
    }
}
