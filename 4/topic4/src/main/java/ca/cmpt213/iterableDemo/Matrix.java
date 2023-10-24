package ca.cmpt213.iterableDemo;


public class Matrix{
	public final int NUM_ROWS;
	public final int NUM_COLS;
	private int[][] values;
	
	public Matrix(int rows, int cols) {
		NUM_ROWS = rows;
		NUM_COLS = cols;
		values = new int[NUM_ROWS][NUM_COLS];
	}

	public static Matrix makeSequentialMatrix(int rows, int cols) {
		Matrix matrix = new Matrix(rows, cols);
		int count = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix.values[i][j] = count;
				count++;
			}
		}
		return matrix;
	}

	@Override
	public String toString(){
		String ret = "";
		for (int i = 0; i < NUM_ROWS; i++) {
			for (int j = 0; j < NUM_COLS; j++) {
				ret += values[i][j];
				if (!(j== NUM_COLS - 1))
					ret += ",";
			}
			ret += "\n";
		}
		return ret;
	}



}
