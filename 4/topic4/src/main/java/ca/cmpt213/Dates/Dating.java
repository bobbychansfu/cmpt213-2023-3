package ca.cmpt213.Dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dating {

    public static void main(String[] args) {
        Date now = new Date();
        Date old = new Date(0);
        System.out.println(now);
        System.out.println(old);

        // System.out.println(now.after(old));
        // System.out.println("Month: " + now.getMonth());

        // System.out.println("Day: " + now.getDate());

        // Calendar Class
        Calendar gc = new GregorianCalendar(){
            @Override
            public String toString(){
                return this.get(Calendar.YEAR) + "-" 
                    + (this.get(Calendar.MONTH)+1) + "-"
                    + (this.get(Calendar.DATE));
            }
        };

        gc.set(2023,Calendar.MARCH,31);
        System.out.println(gc);

        gc.set(Calendar.MONTH,Calendar.FEBRUARY);
        System.out.println(gc);
    }

}