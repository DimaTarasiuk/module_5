package com.dtarasiuk.paterns.structural.proxy;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk(filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading" + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying filename "+ filename);
    }
    
}
