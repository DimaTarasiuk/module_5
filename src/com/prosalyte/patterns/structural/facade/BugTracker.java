package com.prosalyte.patterns.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("sprint is active..");
        activeSprint = true;
    }

    public void stopSpint(){
        System.out.println("Sprint is stopped");
        activeSprint = false;
    }
}
