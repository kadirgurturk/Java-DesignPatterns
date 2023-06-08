package com.kadirgurturk.Bridge.platform;


import com.kadirgurturk.Bridge.video.Video;

public class Amazon extends Platform{


    public Amazon(Video video) {
        super(video);
    }

    @Override
    public void openPlatform() {
        System.out.println("Amazon Çalışıyor");
    }

    @Override
    public void runVideo() {
        video.videoRun();
    }
}
