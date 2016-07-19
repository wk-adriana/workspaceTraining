package com.endava.training;

import java.util.Comparator;

public class PenguinSimpleComparator implements Comparator<Penguin>{

    @Override
    public int compare(Penguin p1, Penguin p2) {
        if (p1.getRace().compareTo(p2.getRace()) == 0) {
            return Double.compare(p1.getAge(), p2.getAge());
        } else {
            return p1.getRace().compareTo(p2.getRace());
        }
    }
}
