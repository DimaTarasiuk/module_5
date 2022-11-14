package com.prosalyte.patterns.behavioral.interpriter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isEEJava = getJavaEEExpression();

        System.out.println("does developer knows java core? " + isJava.interpret("java core"));
        System.out.println("does developer knows java EE? " + isJava.interpret("java EE"));

    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");

        return new AndExpression(java, spring);
    }
}
