package com.dtarasiuk.paterns.creational.abstractFactory.headSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.Doctor;

public class HeadSurgeon implements Doctor {
    @Override
    public void makeSurgery() {
        System.out.println("head surgeon makes surgery...");
    }
}
