package com.dtarasiuk.paterns.creational.factory;

public class RaceCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new RaceCar();
    }
}
