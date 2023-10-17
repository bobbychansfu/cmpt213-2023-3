package ca.cmpt213.Dates;

/**
 * Small test class for the Day class.
 */
public class DayTester {
	public static void main(String[] args) {
		DayOne start = new DayOne(2019, 1, 31);
		System.out.println("Start:     " + start);
		System.out.printf("Accessors: year %d, month %d, day %d.%n",
				start.getYear(), start.getMonth(), start.getDate());

		DayOne tomorrow = start.addDays(1);
		System.out.println("Tomorrow:  " + tomorrow);

		DayOne future = start.addDays(1000);
		System.out.println("Future:    " + future);

		int daysInFuture = future.daysFrom(start);
		System.out.println("Future is  " + daysInFuture + " days away");
	}
}
