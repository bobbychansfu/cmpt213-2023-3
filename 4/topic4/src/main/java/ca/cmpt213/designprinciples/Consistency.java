package ca.cmpt213.designprinciples;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Consistency {
    public static void main(String[] args){
        
        // Example 1:
        int month = 2;
        int day = 23;
        int yr = 2019;
        Calendar gc = new GregorianCalendar(yr, month - 1, day);
        System.out.println(gc);

        // Example 2:
        String s1 = "hello world";
        String s2 = "HElLO WORld";
        

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println();

    }
}
