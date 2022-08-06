package com.prosalyte.patterns.creational.factory;

import com.prosalyte.patterns.creational.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes java code");
    }
}
