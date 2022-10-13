package com.prosalyte.patterns.creational.abstractFactory.banking;

import com.prosalyte.patterns.creational.abstractFactory.Developer;
import com.prosalyte.patterns.creational.abstractFactory.ProjectManager;
import com.prosalyte.patterns.creational.abstractFactory.ProjectTeamFactory;
import com.prosalyte.patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingPM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }


}
