package org.adamc.factory;

import org.adamc.entity.ImageContent;
import org.adamc.interfaces.ImageLoader;

public class ImageLoaderFactory {
    private ImageLoader imageLoader;

    public ImageContent create(String url) {
        return imageLoader.load(url);
    }
}
