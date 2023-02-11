package com.dtarasiuk.paterns.creational.singletone;

public class Main {
    public static void main(String[] args) {
        DBConnect db1 = DBConnect.getInstance();
        DBConnect db2 = DBConnect.getInstance();
        DBConnect db3 = DBConnect.getInstance();

        GaleraConnect galeraConnect = new GaleraConnect();
        GaleraConnect galeraConnect1 = new GaleraConnect();
        GaleraConnect galeraConnect2 = new GaleraConnect();

        DBConnect.query("Select * from db where id = 1");
        System.out.println(galeraConnect);
        System.out.println(galeraConnect1);
        System.out.println(galeraConnect2);

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);


    }
}
