package org.example;

import java.util.ArrayList;
import java.util.List;

public class UFCfighter {
    private String name;
    private String firstName;
    private String fighterName;
    private double weight;
    private List<String> titles;
    private int victories;
    private int defeats;
    private int draws;

    public UFCfighter(String name, String firstName, String fighterName, double weight) {
        this.name = name;
        this.firstName = firstName;
        this.fighterName = fighterName;
        this.weight = weight;
        this.titles = new ArrayList<>();
        this.victories = 0;
        this.defeats = 0;
        this.draws = 0;
    }
    public void addTitle(String title) {
        titles.add(title);
    }
    public List<String> getTitles() {
        return titles;
    }
    public String getFighterName() {
        return fighterName;
    }

    public void addVictory() { victories++; }
    public void addDefeat() { defeats++; }
    public void addDraw() { draws++; }

    public int getVictories() { return victories; }
    public int getDefeats() { return defeats; }
    public int getDraws() { return draws; }

    @Override
    public String toString() {
        return fighterName + " (" + firstName + " " + name + "), poids: " + weight +
                "kg, Titres: " + (titles.isEmpty() ? "Aucun" : String.join(", ", titles)) +
                ", V:" + victories + " D:" + defeats + " N:" + draws;
    }
}