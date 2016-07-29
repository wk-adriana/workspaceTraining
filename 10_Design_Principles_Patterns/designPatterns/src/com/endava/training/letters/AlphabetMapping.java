package com.endava.training.letters;

import java.util.ArrayList;
import java.util.List;

public class AlphabetMapping {
    private List<LetterMapping> alphabet;

    public AlphabetMapping() {
        this.alphabet = new ArrayList<>();
    }

    public void generateAlphabet() {
        for (char letter = 'a'; letter <= 'z' ; letter++) {
            LetterMapping letterMapping = new LetterMapping(letter);
            this.alphabet.add(letterMapping);
        }
    }

    public List<LetterMapping> getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(List<LetterMapping> alphabet) {
        this.alphabet = alphabet;
    }
}
