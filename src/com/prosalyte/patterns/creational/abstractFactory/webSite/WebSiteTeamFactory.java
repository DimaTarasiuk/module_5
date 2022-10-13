package com.prosalyte.patterns.creational.abstractFactory.webSite;

import com.prosalyte.patterns.creational.abstractFactory.Developer;
import com.prosalyte.patterns.creational.abstractFactory.ProjectManager;
import com.prosalyte.patterns.creational.abstractFactory.ProjectTeamFactory;
import com.prosalyte.patterns.creational.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getPM() {
        return new WebsitePM();
    }

    @Override
    public Tester getTester() {
        return new WebSiteTester();
    }
}
