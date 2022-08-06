package com.prosalyte.patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = CreateDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    public static DeveloperFactory CreateDeveloperBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException("No such specialty");
        }
    }
}

