package com.dtarasiuk.paterns.behavioral.iterator;

import java.util.Iterator;

public class NameCollection implements Collection {
    private String[] names;

    public NameCollection(String[] names){
        this.names = names;
    }


    @Override
    public Iterator createIterator() {
        return new NameIterator(names);
    }
}
