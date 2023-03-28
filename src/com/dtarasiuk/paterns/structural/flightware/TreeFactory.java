package com.dtarasiuk.paterns.structural.flightware;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String type, String color){
        Tree tree = treeMap.get(type + color);

        if(tree == null){
            if(type.equals("pine")){
                tree = new PainTree(color);
            }else if(type.equals("oak")){
                tree = new OakTree(color);
            }
            treeMap.put(type + color, tree);
        }
        return tree;
    }
}
