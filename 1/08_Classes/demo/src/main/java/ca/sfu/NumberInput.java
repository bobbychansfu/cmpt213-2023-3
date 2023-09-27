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

        try { 
            age = in.nextInt();
            System.out.println("printing to file");
            writeNumber(age);
        }
        catch (FileNotFoundException e) {

        }
        catch (InputMismatchException e) {
            
        }
        
    }

    public static void writeNumber(int num) throws FileNotFoundException{
        File file = new File("./files/age.txt");
        PrintWriter outFile = new PrintWriter(file);
        outFile.println(num);
        outFile.close();
    }
    
}
