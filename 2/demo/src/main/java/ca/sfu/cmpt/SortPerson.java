package ca.sfu.cmpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import ca.sfu.cmpt.person.Person;

public class SortPerson {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        populatePeople(people);
        displayPeople(people);

        java.util.Collections.sort(people);
        System.out.println("Comparable:");
        displayPeople(people);

        System.out.println("Comparator <age>");
        sortPeopleByAge(people);
        displayPeople(people);
    }

    private static void sortPeopleByAge(ArrayList<Person> people){
        java.util.Collections.sort(people, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        }
        // new Comparator<Person>() {
        //     @Override
        //     public int compare(Person p1, Person p2){ 
        //         return p1.getAge() - p2.getAge();
        //     }
        // }

        );
    }

    private static void populatePeople(ArrayList<Person> people) {
        Random rand = new Random();
        List<String> names = Arrays.asList("David", "Bobby", "Alice", "Gail", "Homer",
                                           "Izzie", "Fred", "Egbert", "Jacob", "Catherine");
        for (int i = 0; i < 10; i++) {
            String name = names.get(i);
            int age = Math.abs(rand.nextInt(100));
            Person p = new Person(name, age);
            people.add(p);
        }
    }
    private static void displayPeople(ArrayList<Person> people) {

        System.out.println("List of people: ");
        for (Person p : people) {
            p.display();
        }
    }
}
