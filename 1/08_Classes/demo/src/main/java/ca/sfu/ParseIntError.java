package ca.sfu;

public class ParseIntError {
    public static void main(String[] args) {
        String str = "abcde";
        int number;
        try {
            number = Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException exc) {
            System.out.println("Conversion exception: " + 
            exc.getMessage());
            
        }
        finally {
            System.out.println("DONE!");
        }

    }
}
