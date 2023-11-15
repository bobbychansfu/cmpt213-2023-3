package ca.sfu.cmpt213.super_sub;

public class SubClass extends SuperClass{
    public SubClass() {
        this(10);
        System.out.println("Subclass");
    }
    public SubClass(int init) {
        super(init);
    }
    public void showSuperValues(int arg) {
        super.showValues(arg);
    }
    @Override
    public void showValues(int arg){
        System.out.println("showValues() - SUBCLASS override - int arg " + arg);
    }
    public void showValues(double arg){
        System.out.println("showValues() - SUBCLASS - double arg " + arg);
    }
}
