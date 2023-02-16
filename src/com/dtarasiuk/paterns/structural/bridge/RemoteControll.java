package com.dtarasiuk.paterns.structural.bridge;

public abstract class RemoteControll {  // bridge between Interface TV and realization classes (samsung and sony)
    protected TV tv;

    public RemoteControll(TV tv) {
        this.tv = tv;
    }

    public abstract void on();
    public abstract void off();
    public abstract void setChanel(int chanel);



}
