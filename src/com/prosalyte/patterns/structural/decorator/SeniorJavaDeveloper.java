package com.prosalyte.patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Senior Java Dev re-viewing code";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
