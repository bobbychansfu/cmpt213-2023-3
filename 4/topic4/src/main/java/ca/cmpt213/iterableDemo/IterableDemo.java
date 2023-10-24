package ca.cmpt213.iterableDemo;

public class IterableDemo {
	public static void main(String args[]) {
		Degree sosyMajor = new Degree("SOSY Major");
		sosyMajor.addCourse(new Course("CMPT 130"));
		sosyMajor.addCourse(new Course("CMPT 135"));
		sosyMajor.addCourse(new Course("CMPT 213"));
		sosyMajor.addCourse(new Course("CMPT 276"));
		sosyMajor.addCourse(new Course("CMPT 373"));
		
		System.out.println(sosyMajor + " includes:");

		for (Course c : sosyMajor){
			System.out.println(" " + c);
		}

//		for (Course course : sosyMajor.courses()) {
//			System.out.println("  " + course);
//		}
	}
}
