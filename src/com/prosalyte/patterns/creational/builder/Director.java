package com.prosalyte.patterns.creational.builder;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWesite(){
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildPrice();
        websiteBuilder.buildCms();

        Website website = websiteBuilder.getWebsite();

        return website;
    }
}
