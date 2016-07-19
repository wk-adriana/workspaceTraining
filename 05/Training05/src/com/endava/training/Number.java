package com.endava.training;

public class Number {

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return  ((a > 0 && b < 0) || (a < 0 && b > 0));
        }
    }

    public boolean scoresIncreasing(int[] scores) {
        int i = 1;
        while (i < scores.length) {
            if (scores[i] < scores[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start ; i < end ; i++) {
            if (heights[i] > heights[i+1]) {
                sum += (heights[i] - heights[i + 1]);
            } else {
                sum += (heights[i+1] - heights[i]);
            }
        }
        return sum;
    }

    public void memoryExpensiveMethod() {
        System.out.println("memoryExpensiveMethod");
        throw new OutOfMemoryError();
    }

    public void stackOverflowMethod() {
        System.out.println("stackOverflowMethod");
        throw new StackOverflowError();
    }

    public int testFinally() {
        int i = 0;
        try {
            i += 2;
            return i;
        } finally {
            System.out.println("Test");
            i += 3;
        }
    }
}
