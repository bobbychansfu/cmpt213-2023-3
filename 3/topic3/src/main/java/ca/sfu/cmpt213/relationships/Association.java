package ca.sfu.cmpt213.relationships;

public class Association {
    class Asset {
        private Manager owner;
        void userAsset() {
            System.out.println("Using Asset!");
            owner.notifyManager();
        }

    }
    class Manager {
        private Asset a;
        public Manager(Asset a) {
            this.a = a;
        }

        public void notifyManager() {

        }

    }


    class Employee {
        private Employee manager;

        public Employee(Employee manager) {
            this.manager = manager;
        }
    }
}
