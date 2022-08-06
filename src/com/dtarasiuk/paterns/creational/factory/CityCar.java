package com.dtarasiuk.paterns.creational.factory;

public class CityCar implements Car{
    @Override
    public void drive() {
        System.out.println("City car drives");
    }
}
