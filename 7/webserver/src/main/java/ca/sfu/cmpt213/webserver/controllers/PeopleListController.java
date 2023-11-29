package ca.sfu.cmpt213.webserver.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.sfu.cmpt213.webserver.models.PeopleList;
import ca.sfu.cmpt213.webserver.models.Person;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class PeopleListController {
    private PeopleList peopleList = new PeopleList();

    // @RequestMapping(value="/person", method=RequestMethod.GET)
    @GetMapping("/person")
    public List<Person> getPeople(@RequestParam(value="uname", defaultValue="steve") String name, 
                                  @RequestParam(value="uage", defaultValue="20") int age) {
        System.out.println("GET /person");
        System.out.println(name);
        System.out.println(age);
        return peopleList.getPeople();
    }

    @GetMapping("/person/{pid}")
    public Person getPerson(@PathVariable long pid) {
        System.out.println("GET /person/" + pid);
        return peopleList.getPerson(pid);
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person newPerson, HttpServletResponse response) {
        System.out.println("POST /person");
        System.out.println(newPerson.getName());
        System.out.println(newPerson.getAge());
        peopleList.addPerson(newPerson);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return newPerson;
    }

    // @DeleteMapping("/person/{pid}")

    @PutMapping("/person/{pid}")
    public void updatePerson(@PathVariable long pid, @RequestBody Map<String,String> newPerson) {
        System.out.println("PUT /person/" + pid);
        
        System.out.println(newPerson.get("name"));
        System.out.println(newPerson.get("age"));

        // Person updatedPerson = peopleList.updatePerson(pid, newPerson.get("name"), newPerson.get("age"));
        // return updatedPerson;
    }

    @PostConstruct
    public void init() {
        // call peopleList to initialize its list of people

        System.out.println("POST CONSTRUCT CODE");

        // peopleList.addPerson(new Person("Steve", 20));
        // peopleList.addPerson(new Person("Bob", 30));
        // peopleList.addPerson(new Person("Alice", 40));
    }

}
