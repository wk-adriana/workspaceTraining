package com.endava.training;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("text.txt");
        int contor = 0;
        char charToFind = 'a';
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                char[] chars = line.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == charToFind) {
                        contor++;
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(contor + " occurences found for the character " + charToFind);
    }
}
