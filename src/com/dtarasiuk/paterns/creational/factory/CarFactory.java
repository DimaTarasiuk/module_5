package com.dtarasiuk.paterns.creational.factory;

import com.prosalyte.patterns.creational.factory.Developer;

public interface CarFactory {
    Car createCar();

    class CppDeveloper implements Developer {
        @Override
        public void writeCode() {
            System.out.println("C++ dev writes cpp code");
        }
    }
}
