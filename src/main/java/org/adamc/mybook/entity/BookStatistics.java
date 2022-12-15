package org.adamc.mybook.entity;

import org.adamc.mybook.repository.Visitor;

public class BookStatistics implements Visitor {
    private int bookCounter = 0;
    private int sectionCounter = 0;
    private int tocCounter = 0;
    private int paragraphCounter = 0;
    private int imageCounter = 0;
    private int tableCounter = 0;
    public void printStatistics() {
        System.out.print(String.format(
                                        "*** Sections: %d\n" +
                                        "*** Table of contents: %d\n" +
                                        "*** Paragraphs: %d\n" +
                                        "*** Images: %d\n" +
                                        "*** Tables: %d\n", sectionCounter, tocCounter, paragraphCounter,  imageCounter, tableCounter));
    }

    @Override
    public void visitBook(Book book) {
        this.bookCounter++;

    }

    @Override
    public void visitSection(Section section) {
        this.sectionCounter++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        this.tocCounter++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.paragraphCounter++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.imageCounter++;
    }

    @Override
    public void visitImage(Image image) {
        this.imageCounter++;
    }

    @Override
    public void visitTable(Table table) {
        this.tableCounter++;
    }
}
