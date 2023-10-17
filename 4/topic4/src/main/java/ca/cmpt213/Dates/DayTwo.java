package ca.cmpt213.Dates;

/**
 * Implementation of a Day class.
 * @author Cay Horstmann
 *
 */
public class DayTwo {
	private int julian;

	// Creation
	public DayTwo(int aYear, int aMonth, int aDate) {
		julian = toJulian(aYear, aMonth, aDate);
	}

	// Accessors
	public int getYear() {
		return fromJulian(julian)[0];
	}
	public int getMonth() {
		return fromJulian(julian)[1];
	}
	public int getDate() {
		return fromJulian(julian)[2];
	}

	// Relative date functions
	public DayTwo addDays(int n) {
		return new DayTwo(julian + n);
	}
	public int daysFrom(DayTwo other) {
		return julian - other.julian;
	}

	public String toString() {
		return getYear() + "-" + getMonth() + "-" + getDate();
	}

	// Helper Functions
	private DayTwo(int aJulian) {
		julian = aJulian;
	}
	private static int toJulian(int year, int month, int date) {
		int jy = year;
		if (year < 0)
			jy++;
		int jm = month;
		if (month > 2)
			jm++;
		else {
			jy--;
			jm += 13;
		}
		int jul = (int) (Math.floor(365.25 * jy)
				+ Math.floor(30.6001 * jm) + date + 1720995.0);

		int IGREG = 15 + 31 * (10 + 12 * 1582);
		// Gregorian Calendar adopted Oct. 15, 1582

		if (date + 31 * (month + 12 * year) >= IGREG)
		// Change over to Gregorian calendar
		{
			int ja = (int) (0.01 * jy);
			jul += 2 - ja + (int) (0.25 * ja);
		}
		return jul;
	}
	private static int[] fromJulian(int j) {
		int ja = j;

		int JGREG = 2299161;
		// The Julian day number of the adoption of the Gregorian calendar

		if (j >= JGREG)
		// Cross-over to Gregorian Calendar produces this correction
		{
			int jalpha = (int) (((float) (j - 1867216) - 0.25) / 36524.25);
			ja += 1 + jalpha - (int) (0.25 * jalpha);
		}
		int jb = ja + 1524;
		int jc = (int) (6680.0 + ((float) (jb - 2439870) - 122.1) / 365.25);
		int jd = (int) (365 * jc + (0.25 * jc));
		int je = (int) ((jb - jd) / 30.6001);
		int date = jb - jd - (int) (30.6001 * je);
		int month = je - 1;
		if (month > 12)
			month -= 12;
		int year = jc - 4715;
		if (month > 2)
			--year;
		if (year <= 0)
			--year;
		return new int[] { year, month, date };
	}

}
