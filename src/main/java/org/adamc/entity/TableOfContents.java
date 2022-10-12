package org.adamc.entity;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents {
    public List<String> contents;

    public TableOfContents() {
        this.contents = new ArrayList<>();
    }

    public TableOfContents(List<String> contents) {
        this.contents = contents;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TableOfContents{" +
                "contents=" + contents +
                '}';
    }
}
