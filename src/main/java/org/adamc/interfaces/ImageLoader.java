package org.adamc.interfaces;

import org.adamc.entity.ImageContent;

public interface ImageLoader {
    ImageContent load(String url);
}
