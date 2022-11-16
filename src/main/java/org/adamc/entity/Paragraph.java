package org.adamc.entity;

import org.adamc.interfaces.Element;
import org.adamc.interfaces.Visitor;

public class Paragraph implements Element {
    private String text;
//    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public void setAlignStrategy(AlignStrategy alignStrategy) {
//        this.textAlignment = alignStrategy;
//    }

    @Override
    public void add(Element element) {
        // add smth
    }

    @Override
    public void remove(Element element) {
        // remove smth
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void print() {
//        if(textAlignment == null) {
            System.out.println("\t" + this.text);
//        } else {
//            textAlignment.render(this);
//        }

    }
}
