package com.dtarasiuk.paterns.behavioral.mediator;

public class Component {
    Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public void click(){
        System.out.println("button is clicked");
    }
    public void keyPress(){
        System.out.println("key is pressed");
    }
}
