package ca.sfu.cmpt213.webserver.models;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {
    private List<Person> people = new ArrayList<>();
    
    public void addPerson(Person newPerson) {
        people.add(newPerson);
        // put in json file as well
    }

    public Person getPerson(long pid){
        // contact json file
        return null;
    }

    public List<Person> getPeople() {
        // contact json file
        return people;
    }

    public void deletePerson(long pid) {
        // contatc json file
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getPid() == pid) {
                people.remove(i);
                break;
            }
        }
    }
}
