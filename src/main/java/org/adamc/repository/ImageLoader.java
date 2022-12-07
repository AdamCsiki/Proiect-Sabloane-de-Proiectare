package org.adamc.repository;

import org.adamc.entity.ImageContent;

public interface ImageLoader {
    ImageContent load(String url);
}
