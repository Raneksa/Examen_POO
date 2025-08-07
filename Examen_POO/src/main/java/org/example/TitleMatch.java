package org.example;

public class TitleMatch extends Match {
    private String titre;

    public TitleMatch(UFCfighter fighter1, UFCfighter fighter2, String titre) {
        super(fighter1, fighter2);
        this.titre = titre;
    }

    @Override
    public void terminer() {
        if (points1 > points2) {
            fighter1.addVictory();
            fighter2.addDefeat();
            fighter1.addTitle(titre);
        } else if (points2 > points1) {
            fighter2.addVictory();
            fighter1.addDefeat();
            fighter2.addTitle(titre);
        } else {
            fighter1.addDraw();
            fighter2.addDraw();
        }
    }
}