package com.dtarasiuk.paterns.structural.adapter;

public class SmsSender {
    public SmsSender(){
        smsMessage = "default message message without adapter";
    }
    private String smsMessage;

    public String initMessage(String message){
        this.smsMessage = message;
        return message;
    }

    public void sendMessage(){
        System.out.println(this.smsMessage);
    }
}
