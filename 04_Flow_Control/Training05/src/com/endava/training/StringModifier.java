package com.endava.training;

public class StringModifier {
    public String backAround(String str) {
        return str.substring(str.length() - 1).concat(str).concat(str.substring(str.length() - 1));
    }

    public String everyNth(String str, int n) {
        String newString =  str.substring(0, 1);
        for (int i = 1 ; i < str.length() ; i++) {
            if (i % n == 0) {
                newString = newString.concat(str.substring(i, i+1));
            }
        }
        return newString;
    }

}
