package com.company;

public class Volleyball extends Team {
  public Volleyball(String name, int numberOfPlayers, String teamTalisman, String country, SportType sportType) {
    super(name, numberOfPlayers, teamTalisman, country, sportType);
  }

  @Override
  public void singHymn(String country) {
    super.singHymn(country);
  }
}
