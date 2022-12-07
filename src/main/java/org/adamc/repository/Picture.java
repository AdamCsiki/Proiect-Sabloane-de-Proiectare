package org.adamc.repository;

import org.adamc.entity.ImageContent;

import java.awt.*;

public interface Picture {
    String url();
    Dimension dm();
    ImageContent content();
}
