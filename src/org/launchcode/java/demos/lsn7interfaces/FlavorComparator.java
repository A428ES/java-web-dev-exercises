package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        int o1Allergen = o1.getAllergens().size();
        int o2Allergen = o2.getAllergens().size();

        return o2Allergen - o1Allergen;
    }
}
