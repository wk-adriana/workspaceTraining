package com.endava.training;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber implements Runnable {

    private List<Integer> integerList;
    private List<Integer> primeIntegerList;
    private int threadNumber;
    private int currentIndex = 0;

    public PrimeNumber(List<Integer> integerList) {
        this.integerList = integerList;
        this.primeIntegerList = new ArrayList<>();
    }

    @Override
    public void run() {
        System.out.println(Thread.activeCount());
        determinePrimeNumbers();
        System.out.println(Thread.currentThread().getName() + " : " + primeIntegerList);
    }

    public List<Integer> getPrimeIntegerList() {
        return primeIntegerList;
    }

    public synchronized void determinePrimeNumbers() {
        while (currentIndex < this.integerList.size()) {
            if (this.isPrime(this.integerList.get(currentIndex))) {
                this.primeIntegerList.add(integerList.get(currentIndex));
            }
            currentIndex++;
        }
    }

    private boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }

        if (number == 0 || number == 1 || number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i++ ) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
