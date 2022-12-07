package org.adamc.entity;

import org.adamc.repository.Element;
import org.adamc.repository.Visitor;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    public List<String> contents;

    public TableOfContents() {
        this.contents = new ArrayList<>();
    }

    public TableOfContents(List<String> contents) {
        this.contents = contents;
    }

    public void add(String string) {
        contents.add(string);
    }

    @Override
    public void add(Element element) {
        // do smth
    }

    @Override
    public void remove(Element element) {
        // remove smth
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    @Override
    public Element get(int i) {
        // get smth
        return null;
    }

    @Override
    public void print() {
        System.out.println("Table of contents: ");
        for(String element : contents) {
            System.out.println("\t" + element);
        }
    }
}
