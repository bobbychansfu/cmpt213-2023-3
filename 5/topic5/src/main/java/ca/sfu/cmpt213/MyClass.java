package ca.sfu.cmpt213;

public class MyClass implements MyInt{
    public void myMethod(){
        System.out.println(name);
        // name = "john"; // error it's static and final
    }
    
}
