package com.prosalyte.patterns.creational.builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice website");
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALFRESCO);
    }
}
