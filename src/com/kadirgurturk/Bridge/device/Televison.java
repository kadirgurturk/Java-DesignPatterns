package com.kadirgurturk.Bridge.device;


import com.kadirgurturk.Bridge.audio.Audio;
import com.kadirgurturk.Bridge.platform.Platform;

public class Televison extends Device{

    public Televison(Audio audio, Platform platform) {
        super(audio, platform);
    }

    @Override
    public void runDevice() {
        System.out.println("Televizyon Açıldı");
    }
}
