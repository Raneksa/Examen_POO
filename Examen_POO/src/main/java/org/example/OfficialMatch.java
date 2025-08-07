package org.example;

public class OfficialMatch extends Match {
    public OfficialMatch(UFCfighter fighter1, UFCfighter fighter2) {
        super(fighter1, fighter2);
    }

    @Override
    public void terminer() {
        if (points1 > points2) {
            fighter1.addVictory();
            fighter2.addDefeat();
        } else if (points2 > points1) {
            fighter2.addVictory();
            fighter1.addDefeat();
        } else {
            fighter1.addDraw();
            fighter2.addDraw();
        }
    }
}