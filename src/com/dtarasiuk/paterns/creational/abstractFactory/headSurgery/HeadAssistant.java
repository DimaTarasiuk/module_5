package com.dtarasiuk.paterns.creational.abstractFactory.headSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.Assistant;

public class HeadAssistant implements Assistant {
    @Override
    public void assistsSurgery() {
        System.out.println("head Assistant assists head surgery");
    }
}
