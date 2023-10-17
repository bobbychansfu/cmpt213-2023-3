package ca.sfu.cmpt213;

public class Person implements Displayable, Comparable<Person>
{
   private String name;
   private int age;
   private final int _NAME = 0;
   private final int _AGE = 1;
   
   // Constructor
   public Person(String n, int a)
   {
      age = a;
      name = n;
   }

   public int getAge(){
      return age;
   }
   public String getName(){
      return this.name;
   }
   
   // display method

   @Override
   public void display(Leading lead){
      if (lead == Leading.NAME)
         System.out.println(name + " : " + age);
      else if (lead == Leading.AGE)
         System.out.println(age + " : " + name);
   }

   // compareTo
   @Override
   public int compareTo(Person otherPerson){
      return name.compareTo(otherPerson.getName());
   }

}
