package org.adamc.repository;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    void accept(Visitor visitor);
    Element get(int i);
}
