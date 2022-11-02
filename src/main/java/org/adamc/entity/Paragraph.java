package org.adamc.entity;

import org.adamc.interfaces.AlignStrategy;
import org.adamc.interfaces.Element;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.textAlignment = alignStrategy;
    }

    @Override
    public void add(Element element) {
        // add smth
    }

    @Override
    public void remove(Element element) {
        // remove smth
    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void print() {
        if(textAlignment == null) {
            System.out.println(/*"Paragraph: " + */ this.text);
        } else {
            textAlignment.render(this);
        }

    }
}
