package com.dtarasiuk.paterns.structural.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
