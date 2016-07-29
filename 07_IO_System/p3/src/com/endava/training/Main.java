package com.endava.training;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:/");
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));
            bufferedWriter.write(file.getAbsolutePath());
            bufferedWriter.newLine();
            listDirectoryContent(file, bufferedWriter, 0);
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void listDirectoryContent(File file, BufferedWriter bufferedWriter, int padding) throws IOException {
            String whiteSpace = "";
            if (padding > 0) {
                whiteSpace = String.format("%" + padding + "s"," ");
            }
            if (file.isDirectory()) {
                if (!file.getName().isEmpty()) {
                    bufferedWriter.write(whiteSpace + file.getName() + "\\");
                    bufferedWriter.newLine();
                }
                padding++;
                File files[] = file.listFiles();
                if (files != null) {
                    for (File fileObj : files) {
                        if (!fileObj.isHidden()) {
                            listDirectoryContent(fileObj, bufferedWriter, padding);
                        }
                    }
                }
            } else {
                bufferedWriter.write(whiteSpace + file.getName());
                bufferedWriter.newLine();
            }
    }
}
