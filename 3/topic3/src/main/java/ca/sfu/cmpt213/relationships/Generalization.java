package ca.sfu.cmpt213.relationships;

public class Generalization {
    class Doctor {
        String name;
        void register(){
            // method is shared with subclasses
        }
    }

    class FamilyDoctor extends Doctor {
        int numPatients;
        // ...
    }

    class HospitalDoctor extends Doctor {
        void performSurgery(){
            // ...
        }
    }
}
