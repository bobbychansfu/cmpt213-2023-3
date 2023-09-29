package ca.sfu.cmpt;

import ca.sfu.cmpt.person.Displayable;

/**
 * Java program to demonstrate nested static and non static classes.
 * How to create instance of static and non static class and 
 * How to call methods of nested static and Inner class in Java. 
 * Overall: comparison of static vs non static class.
 */
class Outer{
    private static String message = "HelloWorld";

    private static class Stat{
        public void display(){
           
            System.out.println("Message from nested static class : " + message);
        }
    }

    private class InnerNonStat{
        public void display(){
            System.out.println("Message from non-static member class : " + message);
        }
    }

    public void display(){
        class Inner{
            public void print(){
                System.out.println("Message from the non-static local inner class. " + message);
            }
        }
        Inner obj = new Inner();
        obj.print();
    }

    public void display_ann(){
        // anon class
        
    }

    public static void main(String... args){
    

    }

}