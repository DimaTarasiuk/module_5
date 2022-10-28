package com.dtarasiuk.paterns.creational.abstractFactory.headSurgery;

import com.dtarasiuk.paterns.creational.abstractFactory.Assistant;
import com.dtarasiuk.paterns.creational.abstractFactory.Doctor;
import com.dtarasiuk.paterns.creational.abstractFactory.HealTeamFactory;
import com.dtarasiuk.paterns.creational.abstractFactory.HospitalManager;
import com.dtarasiuk.paterns.creational.abstractFactory.eyeSurgery.EyeAssistant;

public class HeadDocFactory implements HealTeamFactory {
    @Override
    public Doctor getDoctor() {
        return new HeadSurgeon();
    }

    @Override
    public Assistant getAssistant() {
        return new EyeAssistant();
    }

    @Override
    public HospitalManager getHospitalManager() {
        return new HeadHospitalManager();
    }
}
