package com.kadirgurturk.Bridge.platform;


import com.kadirgurturk.Bridge.video.Video;

public abstract class Platform {

    public Video video;

    public Platform(Video video) {
        this.video = video;
    }

    abstract public void openPlatform();

    abstract public void runVideo();
}
