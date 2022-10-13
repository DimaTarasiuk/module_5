package com.prosalyte.patterns.structural.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database{
    @Override
    public void select() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
