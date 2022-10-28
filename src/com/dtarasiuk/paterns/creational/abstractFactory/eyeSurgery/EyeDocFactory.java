package com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.Assistant;
import com.dtarasiuk.paterns.creational.abstractFactory.Doctor;
import com.dtarasiuk.paterns.creational.abstractFactory.HealTeamFactory;
import com.dtarasiuk.paterns.creational.abstractFactory.HospitalManager;

public class EyeDocFactory implements HealTeamFactory {


    @Override
    public Doctor getDoctor() {
        return new EyeSurgeon();
    }

    @Override
    public Assistant getAssistant() {
        return new EyeAssistant();
    }

    @Override
    public HospitalManager getHospitalManager() {
        return new EyeHospitalManager();
    }
}
