package com.prosalyte.patterns.creational.factory;

import com.prosalyte.patterns.creational.factory.Developer;
import com.prosalyte.patterns.creational.factory.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
