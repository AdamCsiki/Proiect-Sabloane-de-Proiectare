package org.adamc.entity;

import org.adamc.interfaces.Element;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    protected String title;
    protected List<Element> elements;

    public Section() {
        this.title = "";
    }

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Capitol: " + title);
        elements.forEach(Element::print);
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int i) {
        return elements.get(i);
    }
}
