package com.dtarasiuk.paterns.structural.bridge;

public class SamsungTV implements TV{
    @Override
    public void on() {
        System.out.println("Samsung tv is ON");
    }

    @Override
    public void off() {
        System.out.println("Samsung tv is OFF");
    }

    @Override
    public void setChanel(int chanel) {
        System.out.println("Chanel set to " + chanel);
    }
}
