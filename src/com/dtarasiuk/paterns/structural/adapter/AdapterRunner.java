package com.dtarasiuk.paterns.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        SmsSender smsSender = new SmsSender();
        System.out.println(smsSender.initMessage("SMS normal message"));
        System.out.println("");
        MailSender mailSender = new MailSender();
        mailSender.sendMailMessage();
    }
}
