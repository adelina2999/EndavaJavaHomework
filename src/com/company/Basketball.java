package com.company;

public class Basketball extends Team {
  Basketball(String name, int numberOfPlayers, String teamTalisman, String country, SportType sportType) {
    super(name, numberOfPlayers, teamTalisman, country, sportType);
  }
  Basketball() {
    super();
    System.out.println("Creating new class of type" + this.getClass().getName());
  }

  @Override
  public void singHymn(String country) {
    super.singHymn(country);
  }
}
