package org.adamc.entity;

import org.adamc.interfaces.Element;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    protected String title;
    protected List<Element> children;

    public Section() {
        this.title = "";
    }

    public Section(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        children.forEach(Element::print);
    }

    @Override
    public void add(Element element) {
        children.add(element);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
    }

    @Override
    public Element get(int i) {
        return children.get(i);
    }
}
