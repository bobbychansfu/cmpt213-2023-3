package ca.sfu.cmpt213.relationships;

public class Dependency {
    class Asset {
        public void computeSomething() {

        }
    }
    class Manager {
        void useAsset(Asset a) {
            // ...
            a.computeSomething();
            // ... uses the result of computation
        }
    }
}
