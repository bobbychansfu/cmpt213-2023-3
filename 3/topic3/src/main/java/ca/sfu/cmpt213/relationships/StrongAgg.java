package ca.sfu.cmpt213.relationships;

import java.util.ArrayList;
import java.util.List;

public class StrongAgg {
    class Asset {
        // ...
    }
    class Manager {
        private Asset a;
        public Manager() {
            a = new Asset();
        }
    }
}
