package com.prosalyte.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobsite = new JavaDeveloperJobSite();
        jobsite.addVacancy("j position");
        jobsite.addVacancy("j position 2");

        Observer firstsubscriber = new Subscriber("Dima");
        Observer second = new Subscriber("Zeka");

        jobsite.addObserver(firstsubscriber);
        jobsite.addObserver(second);

        jobsite.addVacancy("3rd position");
    }
}
