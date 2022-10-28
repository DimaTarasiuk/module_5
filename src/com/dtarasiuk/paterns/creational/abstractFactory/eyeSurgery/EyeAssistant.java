package com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.Assistant;

public class EyeAssistant implements Assistant {

    @Override
    public void assistsSurgery() {
        System.out.println("eye assistant assists surgery");
    }
}
