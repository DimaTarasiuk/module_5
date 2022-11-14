package com.dtarasiuk.paterns.creational.builder;

public class HiTechHouseBuilder extends HouseBuilder{
    @Override
    void buildWalls() {
        house.setWalls("building hi-tech walls");
    }

    @Override
    void buildRoof() {
        house.setRoof("building hi-tech roof");
    }

    @Override
    void buildWindows() {
        house.setWindows("building hi-tech windows");
    }

    @Override
    void buildDoors() {
        house.setDoors("building hi-tech doors");
    }

    @Override
    void buildType() {
        house.setType(Type.HiTECH);
    }

}
