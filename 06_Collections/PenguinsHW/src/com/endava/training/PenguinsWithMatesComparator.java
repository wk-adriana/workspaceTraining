package com.endava.training;

import java.util.Comparator;

public class PenguinsWithMatesComparator implements Comparator<Penguin> {
    @Override
    public int compare(Penguin p1, Penguin p2) {
        if (Integer.compare(p1.getMatingPartners().size(), p2.getMatingPartners().size()) == 0) {
            if (Double.compare(p1.getMatingPartnersAverageAge(), p2.getMatingPartnersAverageAge()) == 0) {
                return p1.getName().compareTo(p2.getName());
            } else {
                return Double.compare(p1.getMatingPartnersAverageAge(), p2.getMatingPartnersAverageAge());
            }
        } else {
            return Integer.compare(p1.getMatingPartners().size(), p2.getMatingPartners().size());
        }
    }
}
