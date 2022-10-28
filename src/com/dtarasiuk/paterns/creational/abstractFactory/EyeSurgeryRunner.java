package com.dtarasiuk.paterns.creational.abstractFactory;

import com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery.EyeAssistant;
import com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery.EyeDocFactory;
import com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery.EyeHospitalManager;
import com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery.EyeSurgeon;

public class EyeSurgeryRunner {
    public static void main(String[] args) {
        HealTeamFactory healTeamFactory = new EyeDocFactory();
        HospitalManager hospitalManager = new EyeHospitalManager();
        Doctor eyeDoctor = new EyeSurgeon();
        Assistant eyeAssistant = new EyeAssistant();

        System.out.println("eye surgeon started");
        hospitalManager.manageHospital();
        eyeDoctor.makeSurgery();
        eyeAssistant.assistsSurgery();
    }
}
