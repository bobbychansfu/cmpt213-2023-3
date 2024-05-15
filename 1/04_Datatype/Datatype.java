public class Datatype {
    public static void main(String[] args) {
        byte b = 0x3F;
        short s = 13;
        int i = 42;
        long l = 250000000000L;
        float fl = 150.2345F;
        double d = 1.1;
        boolean bo = true;
        char ch = 'A';
        char ch2 = '\u0142';
        String st = "Bobby";

        // System.out.println(b);
        // System.out.print("Hello\n");
        // System.out.format("Value %.2f \n", fl);
        // System.out.println(ch2);
        // System.out.println("helo\blo");
        // System.out.println("hello\rlo");
        // if(i){ // error

        // }

        int num = Integer.parseInt(st);
        int age = Integer.parseInt("24");
        int age2 = 24.93;
        double age3 = 23;
        int num2 = Integer.parseInt("43A",16);
        System.out.println(age2);
    }
}
