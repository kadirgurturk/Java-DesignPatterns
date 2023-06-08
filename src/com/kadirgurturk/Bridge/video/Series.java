package com.kadirgurturk.Bridge.video;

public class Series extends Video{

    public Series(String videoName) {
        super(videoName);
    }

    @Override
    public void videoRun() {
        System.out.println( videoName + "Dizisi Başlıyor...");
    }
}
