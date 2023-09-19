package ca.sfu.cmpt213;

public class PassByValue {
    public static void main(String[] args) {
        String s = "Bobby";
        System.out.println(s);
        changeName(s);
        System.out.println(s);
    }
    
    public static void changeName(String s){
        s = "Steve";
        System.out.println(s);
    }

}
