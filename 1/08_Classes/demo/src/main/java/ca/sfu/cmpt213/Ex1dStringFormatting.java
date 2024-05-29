package ca.sfu.cmpt213;

public class Ex1dStringFormatting {
    public static void main(String[] args) {
        double a = 154.6789;
        int b = 98765;
        System.out.printf("Values: %15.2f, %,10d",a,b);
    }
}
