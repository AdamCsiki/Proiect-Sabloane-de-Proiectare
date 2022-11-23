package org.adamc.interfaces;

public interface Element {
    Element add(Element element);
    void remove(int i);
    void print();
    void accept(Visitor visitor);
    Element get(int i);
}
