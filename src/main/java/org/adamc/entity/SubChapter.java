package org.adamc.entity;

import org.adamc.repository.Element;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;

    private List<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void createNewParagraph(String text) {
        Paragraph paragraph = new Paragraph(text);
        this.elements.add(paragraph);
    }

    public void createNewImage(String name) {
        Image image = new Image(name);
        this.elements.add(image);
    }

    public void createNewTable(String title) {
        Table table = new Table(title);
        this.elements.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);

        System.out.println("Paragraphs:");
        this.elements.forEach((element) -> {
            System.out.print("\t");
            element.print();
        });
    }
}
