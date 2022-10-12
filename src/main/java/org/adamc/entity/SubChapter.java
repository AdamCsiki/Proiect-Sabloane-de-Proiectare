package org.adamc.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubChapter {
    private String name;

    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;

    public SubChapter(String name) {
        this.name = name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void createNewParagraph(String text) {
        Paragraph paragraph = new Paragraph(text);
        this.paragraphs.add(paragraph);
    }

    public void createNewImage(String name) {
        Image image = new Image(name);
        this.images.add(image);
    }

    public void createNewTable(String title) {
        Table table = new Table(title);
        this.tables.add(table);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Subchapter: " + this.name + "\n" +
                "Images: \n\t" + this.images.stream().map(Image::toString).collect(Collectors.joining()) + "\n" +
                "Paragraph: \n\t" + this.paragraphs.stream().map(Paragraph::toString).collect(Collectors.joining()) + "\n" +
                "";
    }
}
