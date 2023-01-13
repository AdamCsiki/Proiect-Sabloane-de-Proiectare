package org.adamc.mybook.entity;

import org.adamc.mybook.obs.ConcreteObserver;
import org.adamc.mybook.repository.Element;

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


    public void registerObserver(ConcreteObserver o) {
        o.update();
    }
}
