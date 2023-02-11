package com.dtarasiuk.paterns.creational.singletone;

public class DBConnect {
    private static DBConnect databaseConnection;
    public DBConnect() {
        int port = 3306;
        String host = "localhost/";
        String login = "root";
        String pass = "root";
    }
    public static DBConnect getInstance(){
        if(DBConnect.databaseConnection == null){
            DBConnect.databaseConnection = new DBConnect();
        }
        return databaseConnection;
    }

    public static void query(String sql){
        System.out.println("Running -> " + sql);
    }
}
