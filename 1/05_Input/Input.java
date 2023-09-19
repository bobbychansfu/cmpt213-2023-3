import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        String fname;
        String lname;
        int age;
        String phone;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter you name: ");
            fname = input.next();
            lname = input.next();
            System.out.print("Enter your age: ");
            age = input.nextInt();
            input.nextLine(); // consume EOL
            System.out.print("Enter your phone: ");
            phone = input.nextLine();
            input.close();
            System.out.println("Fname: "+fname+" lname: "+lname+"\nage: " + age + "\nphone: "+phone);

        }
        catch (Exception e) {
            e.getMessage();
        }
        

        
    }
}
