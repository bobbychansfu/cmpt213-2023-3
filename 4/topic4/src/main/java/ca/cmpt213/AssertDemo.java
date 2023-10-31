package ca.cmpt213;

public class AssertDemo {
    public static void main(String[] args) {
        assertRadius();
    }
    private static void assertRadius(){
        double rSquared = getCircleArea() / Math.PI;
        assert rSquared >= 0;
        double r = Math.sqrt(rSquared);
        System.out.println(r);
    }
    private static double getCircleArea() {
        return -10;
    }
}
