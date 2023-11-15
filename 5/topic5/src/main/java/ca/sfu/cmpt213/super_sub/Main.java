package ca.sfu.cmpt213.super_sub;

public class Main {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.showValues(5);
        s.showValues(1.2);
        s.showValues("hello");
        s.showSuperValues(10);
    }
}
