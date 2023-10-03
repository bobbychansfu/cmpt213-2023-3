package ca.sfu.cmpt;

import com.google.gson.Gson;

import ca.sfu.cmpt.person.Person;

public class GsonDemo {
    public static void main(String[] args) {
       String json = "{\"name\":\"bobby\",\"age\":42}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class); 
        System.out.println(p);
    }
    

}
