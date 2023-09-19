public class Static {
	public static final int TARGET_NUM = 10;
	private static int countNum = 0;
	private int favNum = 0;

	public static void main(String[] args) {
		// static cotext
		//changeFavNum(42);  // error in static method calling non-static method
		displayInfo();
		//favNum = 10;  // error accessing non-static variable
		countNum = 10;
		int h = 2 * TARGET_NUM;
	}

	private void changeFavNum(int i) {
		// non-static context
		favNum = TARGET_NUM + i;
		displayInfo();
	}

	private static void displayInfo() {
		
	}
}


