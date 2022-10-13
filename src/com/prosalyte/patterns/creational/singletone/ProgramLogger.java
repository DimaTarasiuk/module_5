package com.prosalyte.patterns.creational.singletone;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "this is log file \n\n";


    public static synchronized ProgramLogger getProjectLogger(){
        if (programLogger == null)
            programLogger = new ProgramLogger();

        return programLogger;
    }

    private ProgramLogger(){

    }

    public void logInfo(String loginfo){
        logfile += loginfo + "\n";
    }

    public void showLogfile(){
        System.out.println(logfile);
    }
}
