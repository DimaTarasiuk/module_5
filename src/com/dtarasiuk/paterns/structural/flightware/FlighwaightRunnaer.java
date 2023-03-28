package com.dtarasiuk.paterns.structural.flightware;

public class FlighwaightRunnaer {
    private static final String[] types ={"pine", "oak"};
    private static final String[] colors ={"green", "brown"};

    public static void main(String[] args) {
        for (int i =0; i<10; ++i){
            Tree tree = TreeFactory.getTree(getRandomType(), getRandomColor());
            tree.display(getRandomX(), getRandomY());
        }

    }
    private static String getRandomType() {
        return types[(int) (Math.random() * types.length)];
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
