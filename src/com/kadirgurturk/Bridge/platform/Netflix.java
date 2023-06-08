package com.kadirgurturk.Bridge.platform;

import com.kadirgurturk.Bridge.video.Video;


public class Netflix extends Platform{

    public Netflix(Video video) {
        super(video);
    }

    @Override
    public void openPlatform() {
        System.out.println("Netflix Açılıyor...");
    }

    @Override
    public void runVideo() {
        video.videoRun();
    }
}
