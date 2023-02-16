package com.dtarasiuk.paterns.structural.bridge;

public class BsicRemote extends RemoteControll{
    public BsicRemote(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("remote: turning ON tv");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("remote: turning OFF tv" );
        tv.off();
    }

    @Override
    public void setChanel(int chanel) {
        System.out.println("setting channel to " + chanel);
        tv.setChanel(chanel);
    }
}
