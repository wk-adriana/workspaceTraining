package com.endava.training;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        char charToFind = 'a';
        int fileChar;

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("text.txt", "r")) {
            randomAccessFile.seek(12);
            while ((fileChar = randomAccessFile.read()) != -1) {
                if ( (char)fileChar == charToFind) {
                    counter++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(counter + " occurences found for the character " + charToFind);
    }
}
