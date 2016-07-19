package com.endava.training;

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        File file = new File("in.txt");
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Stack<String> stringStack = new Stack<>();
                String[] words = line.split(" ");
                for (String word : words) {
                    stringStack.push(word);
                }
                while (stringStack.size() != 0) {
                    bufferedWriter.write(stringStack.pop());
                    bufferedWriter.write(" ");
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
