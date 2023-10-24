package ca.cmpt213.iterableDemo;

public class Course {
	private String name;
	public Course(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getClass().getName()
				+ "[name=" + name + "]";
	}

}
