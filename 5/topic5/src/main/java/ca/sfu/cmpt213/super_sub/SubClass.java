package ca.sfu.cmpt213.super_sub;

public class SubClass extends SuperClass{
    public SubClass() {
        this(10);
        System.out.println("Subclass");
    }
    public SubClass(int init) {
        super(init);
    }
}
