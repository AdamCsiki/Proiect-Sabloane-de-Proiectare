package org.adamc;

import org.adamc.entity.*;
import org.adamc.factory.TableOfContentsVisitor;
import org.adamc.services.DocumentManager;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("My Book");
        DocumentManager.getInstance().setBook(myBook);
        DocumentManager.getInstance().getBook().print();
    }
}