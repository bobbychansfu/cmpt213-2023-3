package ca.sfu.cmpt213;

import java.util.ArrayList;
import java.util.List;

public class Ex1dShuffle {
    public static void main(String[] args) {
        List<Double> values = new ArrayList<>();
        values.add(Double.valueOf(5.0));
        values.add(7.0);
        values.add((double)6);

        java.util.Collections.shuffle(values);

        System.out.println(values);
    }
}
