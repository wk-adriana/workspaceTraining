package com.endava.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            integerList.add(random.nextInt(10));
        }

        long startTime = System.currentTimeMillis();
        PrimeNumber primeNumber = new PrimeNumber(integerList);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(primeNumber);
        executorService.submit(primeNumber);
        executorService.submit(primeNumber);
        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

//        Thread thread1 = new Thread(primeNumber, "t1");
//        Thread thread2 = new Thread(primeNumber, "t2");
//        Thread thread3 = new Thread(primeNumber, "t3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        thread1.join();
//        thread2.join();
//        thread3.join();
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
//        System.out.println(integerList);
        System.out.println(primeNumber.getPrimeIntegerList());
    }
}
