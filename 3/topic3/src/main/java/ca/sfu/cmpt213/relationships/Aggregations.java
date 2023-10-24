package ca.sfu.cmpt213.relationships;

import java.util.List;

public class Aggregations {
    class Faculty {
        List<Instructor> facList;
        public void addInstructors(Instructor i){
            // ... 
            facList.add(i);
        }
    }
    class Instructor {

    }
}
