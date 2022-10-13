package com.prosalyte.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory =new DeveloperFactory();
        List<Developer> developers =new  ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developers.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developers.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developers.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developers.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developers.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developers.add(developerFactory.getDeveloperBySpecialty("cpp"));

        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
