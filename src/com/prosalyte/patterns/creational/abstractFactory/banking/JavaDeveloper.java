package com.prosalyte.patterns.creational.abstractFactory.banking;

import com.prosalyte.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
