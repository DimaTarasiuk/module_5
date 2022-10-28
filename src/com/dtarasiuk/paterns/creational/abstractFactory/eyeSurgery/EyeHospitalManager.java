package com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.HospitalManager;

public class EyeHospitalManager implements HospitalManager {
    @Override
    public void manageHospital() {
        System.out.println("eye hospital manager manages surgery");
    }
}
