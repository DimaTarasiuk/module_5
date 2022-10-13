package com.prosalyte.patterns.creational.abstractFactory;

import com.prosalyte.patterns.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBackSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getPM();

        System.out.println("creating Banking system");
        pm.manageTeam();
        developer.writeCode();
        tester.testCode();
    }
}
