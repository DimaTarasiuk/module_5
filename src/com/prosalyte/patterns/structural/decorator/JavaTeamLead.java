package com.prosalyte.patterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "sending week report";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }
}
