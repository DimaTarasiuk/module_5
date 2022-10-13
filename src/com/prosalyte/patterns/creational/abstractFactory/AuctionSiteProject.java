package com.prosalyte.patterns.creational.abstractFactory;

import com.prosalyte.patterns.creational.abstractFactory.webSite.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        ProjectManager projectManager = projectTeamFactory.getPM();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();

        System.out.println("Auction project started");
        projectManager.manageTeam();
        developer.writeCode();
        tester.testCode();
    }
}
