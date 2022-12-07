package org.adamc.factory;

import org.adamc.entity.*;
import org.adamc.repository.Visitor;

public class TableOfContentsVisitor implements Visitor {

    private TableOfContents table = new TableOfContents();
    private int pageCounter = 1;

    @Override
    public void visitBook(Book book) {
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
