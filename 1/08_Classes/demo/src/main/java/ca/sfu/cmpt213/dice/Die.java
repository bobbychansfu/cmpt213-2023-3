package ca.sfu.cmpt213.dice;

import java.util.Random;

public class Die {
    private final int MIN_SIDES = 6;
    private int sides;
    private int value;

    public Die(int numSides) {
        if (numSides < MIN_SIDES){
            throw new IllegalArgumentException(
                "Die must have " + MIN_SIDES
            );
        }
        sides = numSides;
        roll();
    }

    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(MIN_SIDES);
    }
}
