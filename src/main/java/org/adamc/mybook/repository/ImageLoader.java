package org.adamc.mybook.repository;

import org.adamc.mybook.entity.ImageContent;

public interface ImageLoader {
    ImageContent load(String url);
}
