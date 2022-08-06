package com.prosalyte.patterns.creational.factory;

import com.prosalyte.patterns.creational.factory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
