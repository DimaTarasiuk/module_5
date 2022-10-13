package com.prosalyte.patterns.creational.singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProjectLogger().toString());
        System.out.println(ProgramLogger.getProjectLogger().toString());
        System.out.println(ProgramLogger.getProjectLogger().toString());
        System.out.println(ProgramLogger.getProjectLogger().toString());
        System.out.println(ProgramLogger.getProjectLogger().toString());
        System.out.println(ProgramLogger.getProjectLogger().toString());
        System.out.println(ProgramLogger.getProjectLogger().toString());

        ProgramLogger.getProjectLogger().logInfo("First log");
        ProgramLogger.getProjectLogger().logInfo("Second log");
        ProgramLogger.getProjectLogger().logInfo("Third log");

        ProgramLogger.getProjectLogger().showLogfile();

    }
}
