package org.adamc.mybook.repository;

import org.adamc.mybook.entity.ImageContent;

import java.awt.*;

public interface Picture {
    String url();
    Dimension dm();
    ImageContent content();
}
