package org.adamc.mybook;

import org.adamc.mybook.entity.Author;
import org.adamc.mybook.entity.Book;
import org.adamc.mybook.entity.Paragraph;
import org.adamc.mybook.entity.Section;
import org.adamc.mybook.obs.ConcreteObserver;
import org.adamc.mybook.services.DocumentManager;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("My book");
        DocumentManager.getInstance().setBook(myBook);
        Author me = new Author("Myself");
        myBook.addAuthor(me);
        Section cap1 = new Section("Chapter 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        myBook.add(cap1);

        ConcreteObserver o = new ConcreteObserver(myBook);
        myBook.registerObserver(o);

        Section s = new Section("Test section");
        myBook.add(s);

        o.getToc().print();
    }
}