package com.dtarasiuk.paterns.creational.builder;

public class OldSchoolHouseBuilder extends HouseBuilder{
    @Override
    void buildWalls() {
        house.setWalls("building old School walls");
    }

    @Override
    void buildRoof() {
        house.setRoof("building old school roof");
    }

    @Override
    void buildWindows() {
        house.setWindows("building old school windows");
    }

    @Override
    void buildDoors() {
        house.setDoors("old school doors are building");
    }

    @Override
    void buildType() {
        house.setType(Type.OLD_SHCOOL);
    }
}
