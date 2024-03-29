package com.dtarasiuk.paterns.behavioral.observer;
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1", subject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2", subject);

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState(10);
        subject.detouch(observer1);

        subject.setState(20);
    }
}

