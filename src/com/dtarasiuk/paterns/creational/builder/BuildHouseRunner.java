package com.dtarasiuk.paterns.creational.builder;

public class BuildHouseRunner {
    public static void main(String[] args) {

        Director director = new Director();
        director.setHouseBuilder(new HiTechHouseBuilder());
        House house = director.buildHouse();
        System.out.println(house);

    }
}
