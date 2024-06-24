package ca.cmpt213.iterableDemo;

import java.util.Iterator;

import ca.cmpt213.sharedreference.Person;

public class IterableDemo {
	public static void main(String args[]) {
		Degree sosyMajor = new Degree("SOSY Major");
		sosyMajor.addCourse(new Course("CMPT 130"));
		sosyMajor.addCourse(new Course("CMPT 135"));
		sosyMajor.addCourse(new Course("CMPT 213"));
		sosyMajor.addCourse(new Course("CMPT 276"));
		sosyMajor.addCourse(new Course("CMPT 373"));
		
		System.out.println(sosyMajor + " includes:");

		// malicious code
		Iterator<Course> itr = sosyMajor.iterator();
		itr.next();
		itr.remove();

		for (Course c : sosyMajor){
			System.out.println(" " + c);
		}

		for (Person student : sosyMajor.students()) {
			System.out.println("  " + student);
		}
	}
}
