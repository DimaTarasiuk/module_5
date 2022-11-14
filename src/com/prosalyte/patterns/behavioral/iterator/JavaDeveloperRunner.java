package com.prosalyte.patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String [] skills = {"java", "Spring",  "Hibernate", "MAven", "PostgresSQl"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Dima", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("developer" + javaDeveloper.getName());
        System.out.println("skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
