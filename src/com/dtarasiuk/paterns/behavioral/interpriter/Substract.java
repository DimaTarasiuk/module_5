package com.dtarasiuk.paterns.behavioral.interpriter;

public class Substract implements Expression{

    private Expression left;
    private Expression right;

    public Substract(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
