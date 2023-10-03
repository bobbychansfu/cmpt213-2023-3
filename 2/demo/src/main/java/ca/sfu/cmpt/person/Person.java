package ca.sfu.cmpt.person;

public class Person implements Displayable, Comparable<Person>{
    String name;
    int age;

    public Person(String n, int a) {
        name =n;
        age = a;        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println(" ( ' (..) ' ) < ( My name is " + name + " and I'm " + age + " ) ");
    }

    @Override
    public int compareTo(Person otherPerson) {
        // returns int based on relativity of this vs otherPerson
        return this.name.compareTo(otherPerson.getName());
    }
    
}
