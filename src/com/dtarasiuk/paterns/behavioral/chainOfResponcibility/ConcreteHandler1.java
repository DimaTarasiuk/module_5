package com.dtarasiuk.paterns.behavioral.chainOfResponcibility;

public class ConcreteHandler1 extends RequestHandler{
    public ConcreteHandler1(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("type2")) {
            System.out.println("Handled by ConcreteHandler2");
        } else {
            super.handleRequest(request);
        }
    }
}
