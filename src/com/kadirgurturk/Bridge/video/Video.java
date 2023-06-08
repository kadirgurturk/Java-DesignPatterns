package com.kadirgurturk.Bridge.video;

public abstract class Video {

    public String videoName;

    public Video(String videoName) {
        this.videoName = videoName;
    }

    abstract public void videoRun();
}
