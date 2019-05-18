package com.example.momentary.finalproject;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class WatchActivity extends AppCompatActivity {
    EditText rtspUrl ;
    Button playButton ;
    VideoView videoView ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);

        rtspUrl = (EditText)this.findViewById(R.id.editText);
        rtspUrl.setText("rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov");
        videoView = (VideoView)this.findViewById(R.id.rtspVideo);
        playButton = (Button)this.findViewById(R.id.playButton);
        playButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                RtspStream(rtspUrl.getEditableText().toString());
            }
        });

    }



    private void RtspStream(String rtspUrl){
        videoView.setVideoURI(Uri.parse(rtspUrl));
        videoView.requestFocus();
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
