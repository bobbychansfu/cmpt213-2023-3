package ca.sfu.cmpt213.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        String filename;
        String friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("what's the file name? ");
        filename = keyboard.nextLine();
        
        File file = new File(filename);
        PrintWriter outputFile = new PrintWriter(file);

        for (int i=1; i<=numFriends; i++){
            friendName = keyboard.nextLine();
            outputFile.println(friendName);
        }

        keyboard.close();
        outputFile.close();
        System.out.println("Data written successfully!");
        
    }
}
