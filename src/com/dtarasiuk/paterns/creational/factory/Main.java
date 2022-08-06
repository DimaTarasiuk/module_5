package com.dtarasiuk.paterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = carByType("city");
        Car car = carFactory.createCar();

        car.drive();

    }

    public static CarFactory carByType(String car){
        if(car.equalsIgnoreCase("race")){
            return new RaceCarFactory();
        }else if(car.equalsIgnoreCase("city")){
            return new CityCarFactory();
        }else throw new RuntimeException("no such type of a car");
    }
}
