package ca.sfu.cmpt213.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String filename = "./files/friends.txt";
        File file = new File(filename);
        try{
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()){
                String friendName = inputFile.nextLine();
                System.out.println(friendName);
            }
            keyboard.close();
            inputFile.close();
        }
        catch (IOException exc) {
            System.out.println("File not found!");
        }
        
        
    }
    

}
