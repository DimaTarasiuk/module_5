package com.dtarasiuk.paterns.creational.builder;

public class House {
   private String walls;
   private String roof;
   private String windows;
   private Type type;

   private String doors;

    public void setWalls(String walls) {
        this.walls = walls;
    }
    public void setDoors(String doors) {
        this.doors = doors;
    }
    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", type=" + type +
                '}';
    }

}
