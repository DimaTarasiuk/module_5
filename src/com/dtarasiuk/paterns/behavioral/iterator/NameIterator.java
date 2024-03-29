package com.dtarasiuk.paterns.behavioral.iterator;

import java.util.Iterator;

public class NameIterator implements Iterator {

    private String[] names;
    private int index;

    public NameIterator(String[] names){
        this.names = names;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return names[index++];
        }else {
            return null;
        }
    }
}
