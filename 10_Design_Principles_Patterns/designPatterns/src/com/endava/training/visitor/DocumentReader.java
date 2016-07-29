package com.endava.training.visitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocumentReader {

    public Document readDocument(String fileName) {
        Document document = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            document = new Document(fileName);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                document.addContent(line);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        return document;
    }
}
