package ca.sfu.cmpt213.relationships;

import java.util.List;

public class Compositions {
    class Browser {
        List<Tab> tabList;
        public Tab addTab(){
            Tab t = new Tab();
            // ... 
            tabList.add(t);
            return t;
        }
    }
    class Tab {
        // ...
    }
}
