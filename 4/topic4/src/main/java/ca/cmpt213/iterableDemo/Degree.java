package ca.cmpt213.iterableDemo;

import ca.cmpt213.sharedreference.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Degree implements Iterable<Course>{
	private String name;
	private List<Course> courses = new ArrayList<Course>();
	private List<Person> students = new ArrayList<Person>();

	public Degree(String name) {
		this.name = name;
	}
	public void addCourse(Course course) {
		courses.add(course);
	}
	public String getName() {
		return name;
	}

	/**
	 * Make it so Degree is iterable
	 * But, questionably meaning!
	 */
	@Override
	public Iterator<Course> iterator() {
		return courses.iterator();
	}
	
	/**
	 * Make it so we can ask, by name, for courses to be iterated over.
	 * (This is better than Degree implementing Iterable)
	 * @return
	 */
	public Iterable<Course> courses() {
		return new Iterable<Course>(){
			@Override
			public Iterator<Course> iterator() {
				return Collections.unmodifiableCollection(courses).iterator();
			}
		};
	}
	public Iterable<Person> students() {
		return new Iterable<Person>(){
			@Override
			public Iterator<Person> iterator() {
				return Collections.unmodifiableCollection(students).iterator();
			}
		};
	}
	
	@Override
	public String toString() {
		return getClass().getName()
				+ "[name=" + name + "]";
	}


}
