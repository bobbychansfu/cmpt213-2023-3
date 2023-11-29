package ca.sfu.cmpt213.webserver.models;

public class Person {
    static private int total = 0;
    private long pid;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.pid = total++;
        this.name = name;
        this.age = age;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public long getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
