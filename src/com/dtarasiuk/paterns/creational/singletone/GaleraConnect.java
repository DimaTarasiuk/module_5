package com.dtarasiuk.paterns.creational.singletone;

public class GaleraConnect {
    public static GaleraConnect databaseConnection;

    public GaleraConnect(){
        String host = "localhost/";
        int port = 3307;
        String user = "test";
        String pass = "test";
    }

    public static void query(String sql){
        System.out.println(sql);
    }

}
