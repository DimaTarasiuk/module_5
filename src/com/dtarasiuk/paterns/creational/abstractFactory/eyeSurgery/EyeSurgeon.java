package com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.Doctor;

public class EyeSurgeon implements Doctor {

    @Override
    public void makeSurgery() {
        System.out.println("Eye surgeon is doing operation");
    }
}
