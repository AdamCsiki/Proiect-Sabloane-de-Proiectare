package org.adamc.entity;

import org.adamc.entity.Author;
import org.adamc.interfaces.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Book extends Section {
    private String title;
    private List<Author> authors;
    private List<Element> elements;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + super.title);
        System.out.println("Authors:");
        this.authors.forEach(Author::print);
        System.out.println("Chapters:");
        this.elements.forEach(Element::print);
    }


}
