package org.adamc.mybook.strategy;

import org.adamc.mybook.entity.Paragraph;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.print("#\t#\t#\t#\t#\t#\t#\t#\t");
        System.out.print(paragraph.getText());
        System.out.println();
    }
}