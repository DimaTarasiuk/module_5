package com.dtarasiuk.paterns.structural.proxy;

public class ProxyPatternRunner {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.jpg");
        Image image2 = new ProxyImage("dog.jpg");

        image1.display();
        image1.display();
        image2.display();
        image2.display();
        image1.display();
    }
}
