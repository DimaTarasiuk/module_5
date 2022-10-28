package com.dtarasiuk.paterns.creational.abstractFactory;

public interface HealTeamFactory {
    Doctor getDoctor();
    Assistant getAssistant();
    HospitalManager getHospitalManager();

}
