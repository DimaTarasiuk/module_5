package com.prosalyte.patterns.creational.abstractFactory.banking;

import com.prosalyte.patterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageTeam() {
        System.out.println("Pm manages Banking project");
    }
}
