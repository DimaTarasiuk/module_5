package com.dtarasiuk.paterns.behavioral.chainOfResponcibility;

public class ChainRunner {
    public static void main(String[] args) {
        RequestHandler requestHandler = new ConcreteHandler2(new ConcreteHandler2(null));

        requestHandler.handleRequest(new Request("type1"));
        requestHandler.handleRequest(new Request("type2"));
        requestHandler.handleRequest(new Request("type3"));
    }
}
