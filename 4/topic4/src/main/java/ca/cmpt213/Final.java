package ca.cmpt213;
import java.util.ArrayList;
import java.util.Date;


/**
 * Test final keyword
 *
 */
public class Final {
	public final int MAXIMUM_PERCENTAGE = 100;
	private final ArrayList<Person> list;
	public Final() {
		list = new ArrayList<Person>();
	}
	//...
	public void doSomething() {
		// Which of the following lines fail?
		
		// a: Read constant to variable & change?
		int w = MAXIMUM_PERCENTAGE;
		w++;

		// b: Change constant?
		MAXIMUM_PERCENTAGE = 50;
		
		// c: Change list object?
		list = new ArrayList<Person>();

		// d: Access from list object?
		int x = list.size();
		x++;

		// e: Change list object's state?
		list.add(new Person("Bobby", 23, new Date()));
	}

}

