package org.example;

public class NormalMatch extends Match {
    public NormalMatch(UFCfighter fighter1, UFCfighter fighter2) {
        super(fighter1, fighter2);
    }

    @Override
    public void terminer() {
        System.out.println("Match amical terminé.");
    }
}