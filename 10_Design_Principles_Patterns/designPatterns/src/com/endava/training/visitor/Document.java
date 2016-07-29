package com.endava.training.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private String name;
    private List<String> content;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContent(String line) {
        if (this.content == null)
            this.content = new ArrayList<>();

        this.content.add(line);
    }
}
