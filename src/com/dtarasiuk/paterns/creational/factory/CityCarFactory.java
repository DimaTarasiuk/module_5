package com.dtarasiuk.paterns.creational.factory;

public class CityCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new CityCar();
    }
}
