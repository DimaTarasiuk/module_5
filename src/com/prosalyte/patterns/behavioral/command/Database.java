package com.prosalyte.patterns.behavioral.command;

public class Database {
    public void insert(){
        System.out.println("Inserting record");
    }
    public void delete(){
        System.out.println("Deleting record");
    }
    public void update(){
        System.out.println("Updating record");
    }
    public void select(){
        System.out.println("Reading record");
    }
}
