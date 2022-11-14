package com.dtarasiuk.paterns.creational.builder;

public class Director {
    HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    House buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        houseBuilder.buildRoof();

        House house = houseBuilder.getHouse();
        return house;
    }
}
