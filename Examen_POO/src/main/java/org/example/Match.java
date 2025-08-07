package org.example;

public abstract class Match {
    public int points2;
    public UFCfighter fighter1;
    public UFCfighter fighter2;
    public int points1;

    public Match(UFCfighter fighter1, UFCfighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public void setPoints(int points1, int points2) {
        this.points1 = points1;
        this.points2 = points2;
    }

    public abstract void finish();
}
