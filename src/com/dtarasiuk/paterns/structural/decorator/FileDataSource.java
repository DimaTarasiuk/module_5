package com.dtarasiuk.paterns.structural.decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileDataSource implements DataSource {
    private String name;

    FileDataSource(String name){
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }
}
