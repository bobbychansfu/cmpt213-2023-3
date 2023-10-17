package ca.sfu.cmpt213.relationships;

public class Realization {
    interface ShapeIF {
        void draw();
    }
    class Rectangle implements ShapeIF {
        @Override
        public void draw() {
            // ...
        }
    }
}
