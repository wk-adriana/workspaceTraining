package com.endava.training.letters;

public class LetterMapping {

    private char letter;

    private int numberOfLetter;

    public LetterMapping(char letter) {
        this.letter = Character.toLowerCase(letter);
        this.numberOfLetter = this.generateNumberOfLetter(this.letter);
    }

    private int generateNumberOfLetter(char letter) {
        return letter - 'a' + 1;
    }

    @Override
    public String toString() {
        return letter + " : " + numberOfLetter;
    }
}
