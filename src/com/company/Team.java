package com.company;

public class Team {
  private String name;
  private int numberOfPlayers;
  private String teamTalisman;
  private String country;
  private SportType sportType;


  Team(String name, int numberOfPlayers, String teamTalisman, String country, SportType sportType) {
    this.name = name;
    this.numberOfPlayers = numberOfPlayers;
    this.teamTalisman = teamTalisman;
    this.country = country;
    this.sportType = sportType;
  }

  Team() {
    System.out.println("Creating new class of type" + this.getClass().getName());
  }

  @Override
  public String toString() {
    return "Team{" +
            "name='" + name + '\'' +
            ", numberOfPlayers=" + numberOfPlayers +
            ", teamTalisman='" + teamTalisman + '\'' +
            ", country='" + country + '\'' +
            ", sportType=" + sportType +
            '}';
  }

  public void singHymn() {
    System.out.println(country + " bla bla bla");
  }

  public SportType getSportType() {
    return sportType;
  }

  public void setSportType(SportType sportType) {
    this.sportType = sportType;
  }

  public void singHymn(String country) {
    System.out.println(country + " bla bla bla");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfPlayers() {
    return numberOfPlayers;
  }

  public void setNumberOfPlayers(int numberOfPlayers) {
    this.numberOfPlayers = numberOfPlayers;
  }

  public String getTeamTalisman() {
    return teamTalisman;
  }

  public void setTeamTalisman(String teamTalisman) {
    this.teamTalisman = teamTalisman;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
