package com.prosalyte.patterns.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs =  {
            new BanckSystem(new JavaDeveloper()),
            new StockExenge(new CppDeveloper())
        };

        for (Program program: programs){
            program.developProgram();
        }
    }

}
