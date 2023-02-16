package com.dtarasiuk.paterns.structural.bridge;

public class SonyTV implements TV{
    @Override
    public void on() {
        System.out.println("Sony TV is ON");
    }

    @Override
    public void off() {
        System.out.println("Sony TV is OFF");
    }

    @Override
    public void setChanel(int chanel) {
        System.out.println("Chanel set to " + chanel);
    }
}
