package com.dtarasiuk.paterns.behavioral.interpriter;

public class Interpriter {
    private Expression expression;

    public Interpriter(Expression expression){
        this.expression = expression;
    }

    public int interpret(){
        return expression.interpret();
    }
}
