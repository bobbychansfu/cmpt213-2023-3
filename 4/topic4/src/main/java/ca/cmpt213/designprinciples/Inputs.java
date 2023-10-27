package ca.cmpt213.designprinciples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Inputs {
	void blah() throws IOException {
		// Before Java 5.0
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		
		// With Java 5.0
		Scanner scanner = new Scanner(System.in);
		String line2 = scanner.nextLine();
		scanner.close();
		System.out.println(line1 + line2);
	}
}
