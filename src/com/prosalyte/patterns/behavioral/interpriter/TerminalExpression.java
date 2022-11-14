package com.prosalyte.patterns.behavioral.interpriter;

public class TerminalExpression implements Expression{
    private String data;


    TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;

    }
}
