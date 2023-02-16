package com.dtarasiuk.paterns.structural.bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        TV sonyTV = new SonyTV();
        RemoteControll basicRemote = new BsicRemote(sonyTV);
        basicRemote.on();
        basicRemote.setChanel(2);
        basicRemote.off();

        TV samsungTV =  new SamsungTV();
        basicRemote = new BsicRemote(samsungTV);
        basicRemote.on();
        basicRemote.setChanel(12);
        basicRemote.off();



    }
}
