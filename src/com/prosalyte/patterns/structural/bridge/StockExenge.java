package com.prosalyte.patterns.structural.bridge;

public class StockExenge extends Program{

    protected StockExenge(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development is ongoing");
        developer.writeCode();
    }
}
