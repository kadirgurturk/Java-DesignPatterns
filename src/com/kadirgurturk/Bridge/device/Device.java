package com.kadirgurturk.Bridge.device;


import com.kadirgurturk.Bridge.audio.Audio;
import com.kadirgurturk.Bridge.platform.Platform;

public abstract class Device {

    public Audio audio;

    public Platform platform;

    public Device(Audio audio, Platform platform) {
        this.audio = audio;
        this.platform = platform;
    }

    abstract public void runDevice();

    public void watch()
    {
        runDevice();
        audio.connection();
        platform.openPlatform();
        platform.runVideo();
    }
}
