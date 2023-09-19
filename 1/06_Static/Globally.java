public class Globally {
    public static void main(String[] args) {
        // valids
        MyClass obj = new MyClass();
        obj.pubNonStatic(); // valid
        obj.pubStatic(); 
        MyClass.pubStatic(); // valid

        // invalids
        // *.priv*; // invalid
        // MyClass.pubNonStatic();

    }
   
}
