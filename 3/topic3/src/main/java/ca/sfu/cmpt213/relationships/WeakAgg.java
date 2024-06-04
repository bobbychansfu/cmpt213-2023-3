package ca.sfu.cmpt213.relationships;

import java.util.ArrayList;
import java.util.List;

public class WeakAgg {
    class Asset {
        // ...
    }
    class Manager {
        List<Asset> assets = new ArrayList<>();
        void addAsset(Asset a) {
            assets.add(a);
        }
    }
}
