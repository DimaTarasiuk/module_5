package com.dtarasiuk.paterns.creational.builder;

public abstract class HouseBuilder {
    House house;

    void createHouse(){
        house = new House();
    }

    abstract void buildWalls();
    abstract void buildRoof();
    abstract void buildWindows();
    abstract void buildDoors();
    abstract void buildType();

    House getHouse(){
        return house;
    }

}
