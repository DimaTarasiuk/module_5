package com.dtarasiuk.paterns.behavioral.mediator;

public interface Mediator {
    public void notify(Component sender, String event);
}
