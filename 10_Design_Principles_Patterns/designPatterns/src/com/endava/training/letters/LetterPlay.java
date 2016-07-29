package com.endava.training.letters;

public class LetterPlay {
    public static void main(String[] args) {
        LetterMapping letter = new LetterMapping('b');
        System.out.println(letter);
        AlphabetMapping alphabetMapping = new AlphabetMapping();
        alphabetMapping.generateAlphabet();
        System.out.println(alphabetMapping.getAlphabet());
    }
}
