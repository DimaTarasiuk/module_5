package com.dtarasiuk.paterns.structural.decorator;

import java.util.Base64;

public class EncriptionDecorator extends DataSourceDecorator{
    EncriptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data){
        super.writeData(encode(data));
    }

    public String readData(String data){
        return decode(super.readData());
    }//some error here

    private String encode(String data){
        byte[] result = data.getBytes();
        for (int i = 0; i<result.length; i++){
            result[i] += (byte) 1;
        }
        return new String(result);
    }

    private String decode(String data){
        byte result[] = Base64.getDecoder().decode(data);
        for (int i = 0; i< result.length; i++){
            result[i]-= (byte) 1;
        }
        return new String(result);
    }
}
