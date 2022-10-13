package com.prosalyte.patterns.creational.abstractFactory.webSite;

import com.prosalyte.patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php developer writes code");
    }
}
