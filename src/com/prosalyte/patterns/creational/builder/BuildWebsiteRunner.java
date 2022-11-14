package com.prosalyte.patterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {

        Director director = new Director();
        director.setWebsiteBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWesite();

        System.out.println(website);
    }
}
