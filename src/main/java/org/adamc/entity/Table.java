package org.adamc.entity;

public class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Table: " + this.title + "\n";
    }
}
