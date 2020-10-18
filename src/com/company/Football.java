package com.company;

public class Football extends Team {
  Football(String name, int numberOfPlayers, String teamTalisman, String country, SportType sportType) {
    super(name, numberOfPlayers, teamTalisman, country, sportType);
  }
  Football() {
    super();
    System.out.println("Creating new class of type" + this.getClass().getName());
  }

  @Override
  public void singHymn(String country) {
    super.singHymn(country);
  }
}
