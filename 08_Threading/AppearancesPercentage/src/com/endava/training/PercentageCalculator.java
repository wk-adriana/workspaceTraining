package com.endava.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PercentageCalculator implements Runnable{
    private Map<String, Integer> wordFrequency;
    private BufferedReader bufferedReader;

    public PercentageCalculator(BufferedReader bufferedReader) {
        this.wordFrequency = new HashMap<>();
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void run() {
        calculateWordFrequency();
    }

    public Map<String, Integer> getWordFrequency() {
        return wordFrequency;
    }

    private void calculateWordFrequency(){
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\W+");
//                String[] words = line.split("[^a-zA-Z0-9]");
                for (String word : words) {
                    Integer currentWordFrequency = wordFrequency.get(word.toLowerCase());
                    if (currentWordFrequency != null) {
                        wordFrequency.put(word.toLowerCase(), currentWordFrequency + 1);
                    } else {
                        wordFrequency.put(word.toLowerCase(), 1);
                    }
                }
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
