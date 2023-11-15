package ca.sfu.cmpt213.super_sub;

public class SuperClass {
    public SuperClass(){
        System.out.println("SUPERCLASS constructor, no-args");
    }
    public SuperClass(int arg){
        System.out.println("SUPERCLASS constructor, arg: "+ arg);
    }
    public void showValues(int arg) {
        System.out.println("showValue() - SUPERCALSS int arg " + arg);
    }
    public void showValues(String arg) {
        System.out.println("showValue() - SUPERCALSS Str arg " + arg);
    }
}
