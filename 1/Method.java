public class Method {
    public static void main(String[] args) {
        String name = "Bobby";
        int age = 42;

        greet(name,age);
    }
    private static void greet(String name, int age) {
        System.out.println(name + " " + age);
    }
}
