package com.dtarasiuk.paterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Components implements Component {
    private List<Component> children = new ArrayList<Component>();

    public void add(Component component){
        children.add(component);
    }
    @Override
    public void display() {
        for (Component component:children){
            component.display();
        }
    }
}
