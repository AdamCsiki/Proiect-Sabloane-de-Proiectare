package org.adamc.mybook.obs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.adamc.mybook.entity.Book;
import org.adamc.mybook.entity.TableOfContents;
import org.adamc.mybook.factory.TableOfContentsVisitor;
import org.adamc.mybook.repository.Observer;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConcreteObserver implements Observer {
    private TableOfContentsVisitor tocVisitor;
    public ConcreteObserver(Book myBook) {
        this.tocVisitor = new TableOfContentsVisitor(myBook);
    }

    @Override
    public void update() {
        tocVisitor.createToc();
    }

    public TableOfContents getToc() {
        return tocVisitor.getTableOfContent();
    }
}
