package org.adamc.entity;

import org.adamc.entity.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
    private long id;
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;
    private TableOfContents tableOfContents;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
        this.tableOfContents = new TableOfContents();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String name) {
        Chapter chapter = new Chapter(name);
        this.chapters.add(chapter);

        return this.chapters.size() - 1;
    }

    public Chapter getChapter(int chapterIndex) {
        return this.chapters.get(chapterIndex);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book: \n" +
                "Title: " + this.title + "\n" +
                "Authors: \n\t" + this.authors.stream().map(Author::toString).collect(Collectors.joining()) + "\n" +
                "Chapters: \n\t" + this.chapters.stream().map(Chapter::toString).collect(Collectors.joining()) + "\n" +
                "Table of Contents: " + this.tableOfContents;
    }
}
