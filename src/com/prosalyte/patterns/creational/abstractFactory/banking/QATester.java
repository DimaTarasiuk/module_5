package com.prosalyte.patterns.creational.abstractFactory.banking;

import com.prosalyte.patterns.creational.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester tests a code");
    }
}
