package com.prosalyte.patterns.creational.abstractFactory.webSite;

import com.prosalyte.patterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageTeam() {
        System.out.println("Web manager manages web project");
    }
}
