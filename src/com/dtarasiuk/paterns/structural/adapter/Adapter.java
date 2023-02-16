package com.dtarasiuk.paterns.structural.adapter;

public class Adapter {
    public String adoptMessage(String message){
        StringBuilder adopteeMessage = new StringBuilder(message);
        adopteeMessage.reverse();
        return adopteeMessage.toString();
    }
}
