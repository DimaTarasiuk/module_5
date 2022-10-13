package com.prosalyte.patterns.creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ProjectManager getPM();
    Tester getTester();

}
