package com.prosalyte.patterns.behavioral.template;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("+===================");

        newsPage.showPage();
    }
}
