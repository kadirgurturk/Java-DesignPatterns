package com.kadirgurturk.Bridge.audio;

public class Speaker extends Audio{

    public Speaker() {
    }

    @Override
    public void connection() {
        System.out.println("Hoparlör Takıldı");
    }
}
