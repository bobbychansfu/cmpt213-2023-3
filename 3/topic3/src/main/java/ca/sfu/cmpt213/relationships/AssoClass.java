package ca.sfu.cmpt213.relationships;

public class AssoClass {
    class Company { }
    class Employee { }
    class Employment {
        private Company c;
        private Employee e;
        private float salaray;
        private String startDate;
        // ...
    }
}
