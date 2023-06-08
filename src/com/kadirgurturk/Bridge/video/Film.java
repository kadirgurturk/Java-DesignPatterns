package com.kadirgurturk.Bridge.video;

public class Film extends Video{

    public Film(String videoName) {
        super(videoName);
    }

    @Override
    public void videoRun() {
        System.out.println( videoName + "Filmi Başlıyor");
    }
}
