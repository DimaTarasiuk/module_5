package com.prosalyte.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void hadnlerEvent(List<String> vacancy) {
        System.out.println("dear" + name + "some changes in vacancies; " + vacancy);
    }
}
