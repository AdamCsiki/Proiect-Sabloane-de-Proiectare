package org.adamc.entity;

import org.adamc.interfaces.Element;
import org.adamc.interfaces.Visitor;

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
        System.out.println("Table of contents: " + contents);
    }
}
