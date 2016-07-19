package com.endava.training;

import java.util.List;

public class Calculator {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer divide(Integer a, Integer b) {
        return  a/b;
    }

    public Integer average(List<Integer> collection) {
        int sum = 0;
        for (int i : collection) {
            sum += i;
        }
        return sum/collection.size();
    }
}
