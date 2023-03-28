package com.dtarasiuk.paterns.structural.facade;

public class FacadeRunner {
    public static void main(String[] args) {
        CompFacade facade = new CompFacade();
        facade.start();
    }
}
