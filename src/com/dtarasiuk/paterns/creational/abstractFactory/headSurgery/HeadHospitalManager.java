package com.dtarasiuk.paterns.creational.abstractFactory.headSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.HospitalManager;

public class HeadHospitalManager implements HospitalManager {
    @Override
    public void manageHospital() {
        System.out.println("managing head surgery department");
    }
}
