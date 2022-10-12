package org.adamc.entity;

public class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Paragraph: " + this.text + "\n";
    }
}
