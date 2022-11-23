package org.adamc.entity;

import org.adamc.interfaces.Element;
import org.adamc.interfaces.Visitor;

public class Song implements Element {
    private String title;
    private int size;

    public Song(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Element add(Element element) {
        return null;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public void print() {
        System.out.printf("%s %d", title, size);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSong(this);
    }

    @Override
    public Element get(int i) {
        return null;
    }
}
