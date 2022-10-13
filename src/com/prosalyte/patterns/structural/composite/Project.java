package com.prosalyte.patterns.structural.composite;

import com.prosalyte.patterns.creational.abstractFactory.Tester;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
