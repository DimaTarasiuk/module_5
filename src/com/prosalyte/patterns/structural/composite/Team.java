package com.prosalyte.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
  private List<Developer> developers = new ArrayList<>();

  public void addDeveloper(Developer developer){
      developers.add(developer);
  }

  public void removeDeveloper(Developer developer){
      developers.remove(developer);
  }

  public void createProject(){
      System.out.println("Team creates Project");
      for (Developer developer: developers){
          developer.writeCode();
      }
  }
}
