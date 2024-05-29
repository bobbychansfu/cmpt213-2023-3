package ca.sfu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        // enter 5 names
        
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[7]);

        try { 
            age = in.nextInt();
            System.out.println("printing to file");
            writeNumber(age);
        }
        catch (FileNotFoundException e) {

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        
    }

    public static void writeNumber(int num) throws FileNotFoundException{
        File file = new File("./files/age.txt");
        PrintWriter outFile = new PrintWriter(file);
        outFile.println(num);
        outFile.close();
    }
    
}
