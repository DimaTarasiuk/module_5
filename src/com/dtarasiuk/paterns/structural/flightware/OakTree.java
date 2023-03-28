package com.dtarasiuk.paterns.structural.flightware;
//flightweight class
public class OakTree implements Tree{
    private String color;

    public OakTree(String color){
        this.color=color;
        System.out.println("creting a" + color+ " Oak tree");
    }
    @Override
    public void display(int x, int y) {
        System.out.println("Drawing a " + color + " oak tree at (" + x + ", " + y + ")");
    }
}
