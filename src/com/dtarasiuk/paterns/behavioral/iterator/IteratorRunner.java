package com.dtarasiuk.paterns.behavioral.iterator;

import java.util.Iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String [] names = {"Johb","Jacob", "Monty"};
        Collection collection = new NameCollection(names);
        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
