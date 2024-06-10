package ca.cmpt213.sharedreference;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class SharedReference {
    public static void main(String[] args) {
        exploitBirthday();
    }

    private static void exploitBirthday() {
        Date b = new GregorianCalendar(2016, Calendar.MAY, 22, 23, 2).getTime();
        Person jacob = new Person("Jacob", 7, b);
        System.out.println(jacob.getBirthday());

        // ... mal
        Date d = jacob.getBirthday();
        d.setTime(0);

        System.out.println(jacob.getBirthday());
    }

    private static exploitConstructor() {
        Date now = new Date();
        Person jacob = new Person("Jacob", 0, now);
        System.out.println(jacob.getBirthday());

        // ... mal
        now.setTime(0);

        System.out.println(jacob.getBirthday());
    }
}
