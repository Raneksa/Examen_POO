package org.example;

public class NormalMatch extends Match {
    public NormalMatch(UFCfighter fighter1, UFCfighter fighter2) {
        super(fighter1, fighter2);
    }

    @Override
    public void finish() {
        System.out.println("End of Amical Match");
    }
}
