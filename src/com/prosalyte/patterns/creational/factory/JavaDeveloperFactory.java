package com.prosalyte.patterns.creational.factory;

import com.prosalyte.patterns.creational.factory.Developer;
import com.prosalyte.patterns.creational.factory.DeveloperFactory;
import com.prosalyte.patterns.creational.factory.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper() {
        };
    }
}
