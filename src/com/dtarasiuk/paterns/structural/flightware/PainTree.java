package com.dtarasiuk.paterns.structural.flightware;



public class PainTree implements Tree{
    private String color;

    public PainTree(String color){
        this.color = color;
        System.out.println("Creating a" + color + "pine tree");
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Drawing a  " + color + "pine tree at (\" + x + \", \" + y + \")\")");
    }
}
