package com.endava.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	 String fileName = "text.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)))) {
            PercentageCalculator percentageCalculator = new PercentageCalculator(bufferedReader);
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            executorService.submit(percentageCalculator);
            executorService.submit(percentageCalculator);
            executorService.submit(percentageCalculator);
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);

            Map<String, Integer> wordFrequencyMap = percentageCalculator.getWordFrequency();
            for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ", " + entry.getValue());
            }
        } catch (InterruptedException | IOException ex) {
            ex.getMessage();
        }
    }
}
