package com.dtarasiuk.paterns.behavioral.interpriter;

public class InterpretRunner {
    public static void main(String[] args) {
        Expression expression = new Add(new Number(10), new Substract(new Number(5), new Number(2)));
        Interpriter interpriter = new Interpriter(expression);
        System.out.println(interpriter.interpret());
    }
}
