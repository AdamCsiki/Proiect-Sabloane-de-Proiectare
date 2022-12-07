package org.adamc.services;

import lombok.Data;
import lombok.Getter;
import org.adamc.entity.Book;

@Data
public class DocumentManager {
    private static DocumentManager documentManager = new DocumentManager();
    private Book book;

    private DocumentManager() {

    }

    public static DocumentManager getInstance() {
        return documentManager;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return this.book;
    }
}
