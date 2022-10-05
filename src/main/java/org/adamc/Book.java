package org.adamc;

import java.util.List;

public class Book {
    private String title;
    private List<String> paragraphs;
    private List<String> images;
    private List<String> tables;

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        getParagraphs().add(paragraph);
    }

    public void createNewImage(String image) {
        getImages().add(image);
    }

    public void createNewTable(String table) {
        getTables().add(table);
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> table) {
        this.tables = table;
    }

    public void print() {

    }
}
