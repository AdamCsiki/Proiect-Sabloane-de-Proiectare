package org.adamc.mybook.factory;

import org.adamc.mybook.entity.*;
import org.adamc.mybook.repository.Visitor;

public class TableOfContentsVisitor implements Visitor {

    private TableOfContents table = new TableOfContents();
    private Section section;
    private int pageCounter = 1;

    public TableOfContentsVisitor(Section section) {
        this.section = section;
        this.table = new TableOfContents();
    }

    @Override
    public void visitBook(Book book) {
    }

    public TableOfContents createToc() {
        this.section.accept(this);
        return table;
    }

    @Override
    public void visitSection(Section section) {
        table.add(section.getTitle() + "..." + pageCounter);
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        pageCounter++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        pageCounter++;
    }

    @Override
    public void visitImage(Image image) {
        pageCounter++;
    }

    @Override
    public void visitTable(Table table) {
        pageCounter++;
    }

    public TableOfContents getTableOfContent() {
        return table;
    }
}
