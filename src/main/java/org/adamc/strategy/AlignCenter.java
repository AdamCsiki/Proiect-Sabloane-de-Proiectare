package org.adamc.strategy;

import org.adamc.entity.Paragraph;
import org.adamc.interfaces.AlignStrategy;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.print("#\t#\t#\t#\t");
        System.out.print(paragraph.getText());
        System.out.print("\t#\t#\t#\t#");
        System.out.println();
    }
}