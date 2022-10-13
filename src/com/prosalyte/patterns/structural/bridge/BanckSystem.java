package com.prosalyte.patterns.structural.bridge;

public class BanckSystem extends Program{

    protected BanckSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development is ongoing");
        developer.writeCode();
    }
}
