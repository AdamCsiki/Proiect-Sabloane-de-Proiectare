package org.adamc.entity;

import org.adamc.interfaces.Element;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + super.title);
        System.out.println("Authors:");
        this.authors.forEach(Author::print);
        super.elements.forEach(Element::print);
    }


}
