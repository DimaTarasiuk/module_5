package com.dtarasiuk.paterns.structural.adapter;

public class MailSender {
    public MailSender(){
        mailMessage = "detpada eb dluohs egassem detreveR";
    }
    private String mailMessage;

    public void sendMailMessage(){
        System.out.println("====not adopted====");
        System.out.println(this.mailMessage);
    }
}
