package org.adamc.mybook.services;

import lombok.Data;
import org.adamc.mybook.entity.Book;
import org.springframework.stereotype.Component;

@Data
@Component
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
