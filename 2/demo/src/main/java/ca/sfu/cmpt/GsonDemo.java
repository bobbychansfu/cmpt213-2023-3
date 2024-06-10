package ca.sfu.cmpt;

import java.io.File;
import java.io.PrintWriter;

import com.google.gson.Gson;

import ca.sfu.cmpt.person.Person;

public class GsonDemo {
    public static void main(String[] args) throws Exception{
       String json = "{\"name\":\"bobby\",\"age\":42, \"address\":{\"street\":\"1234 Main St.\",\"number\":1234,\"city\":\"Vancouver\"}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class); 
        System.out.println(p);

        String filename = "./person.txt";
        
        File file = new File(filename);
        PrintWriter outputFile = new PrintWriter(file);
        
        
        outputFile.println(p);
        
        outputFile.close();

    }
    

}
