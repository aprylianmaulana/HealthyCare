package com.example.aprylianmaulana.healthycare;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class HLActivity extends AppCompatActivity {

    Button playButton1;
    VideoView videoView;
    MediaController mediac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hl);

        playButton1 = (Button) findViewById(R.id.playbtn1);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediac = new MediaController(this);
    }

    public void videoplay(View v){
        String videopath = "android.resource://com.example.aprylianmaulana.healthycare/"+R.raw.healthy_video;
        Uri uri = Uri.parse(videopath);
        videoView.setVisibility(View.VISIBLE);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediac);
        mediac.setAnchorView(videoView);
        videoView.start();
    }

}
