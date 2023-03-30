package com.dtarasiuk.paterns.behavioral.observer;

public class ConcreteObserver implements Observer{
    private String name;
    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }


    @Override
    public void update() {
        System.out.println(name + "reeive update" + subject.getState());
    }
}
