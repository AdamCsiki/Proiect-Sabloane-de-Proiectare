package org.adamc.mybook.factory;

import org.adamc.mybook.entity.ImageContent;
import org.adamc.mybook.repository.ImageLoader;

public class ImageLoaderFactory {
    private ImageLoader imageLoader;

    public ImageContent create(String url) {
        return imageLoader.load(url);
    }
}
