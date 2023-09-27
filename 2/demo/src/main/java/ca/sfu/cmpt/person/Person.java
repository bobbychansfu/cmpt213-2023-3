package ca.sfu.cmpt.person;

public class Person implements Displayable {
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
        System.out.println("\n    ^      ^ \n @( ' (..) ') < ( My name is " + name + " and I'm " + age + " ) \n");
    }

    
}
