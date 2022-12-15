package org.adamc.mybook.strategy;

import org.adamc.mybook.entity.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph);

}
