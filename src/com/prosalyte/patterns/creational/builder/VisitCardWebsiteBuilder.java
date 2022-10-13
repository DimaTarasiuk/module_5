package com.prosalyte.patterns.creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("visit card");
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRES);
    }
}
