package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Team> echipe = new ArrayList();
        echipe.add(new Football("FC Barcelona", 15, "Lionel Messi", "Spania", SportType.FOOTBALL));
        echipe.add(new Basketball("Echipa", 10, "Lionel Mussi", "Moldova", SportType.BASKETBALL));
        echipe.add(new Volleyball("FC Echipa", 6, "Lion", "Romania", SportType.VOLLEYBALL));
        echipe.add(new Football("FC Barcelona", 15, "Lionel", "Spania", SportType.FOOTBALL));
        echipe.add(new Basketball("Echipa", 10, "Mussi", "Moldova", SportType.BASKETBALL));
        echipe.add(new Volleyball("FC Echipa", 6, "Lio", "Romania", SportType.VOLLEYBALL));
        echipe.add(new Football("FC Barcelona", 15, "Messi", "Spania", SportType.FOOTBALL));
        echipe.add(new Basketball("Echipa", 10, "Lionussi", "Moldova", SportType.BASKETBALL));
        echipe.add(new Volleyball("FC Echipa", 6, "Liona", "Romania", SportType.VOLLEYBALL));

        List<Team> football = echipe.stream()
                .filter(team -> team.getSportType().equals(SportType.FOOTBALL))
                .collect(Collectors.toList());
        List<Team> basketball = echipe.stream()
                .filter(team -> team.getSportType().equals(SportType.BASKETBALL))
                .collect(Collectors.toList());
        List<Team> other = echipe.stream()
                .filter(team -> !team.getSportType().equals(SportType.BASKETBALL) && !team.getSportType().equals(SportType.FOOTBALL))
                .collect(Collectors.toList());

        int a = 6;
    }
}
