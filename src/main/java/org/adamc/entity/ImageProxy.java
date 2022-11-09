package org.adamc.entity;

import org.adamc.interfaces.Element;
import org.adamc.interfaces.Picture;
import org.adamc.interfaces.Visitor;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element, Picture {
    private String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }
    // loads the image from the URL,
    // may take some time
    public Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void add(Element element) {
        // add smth
    }

    @Override
    public void remove(Element element) {
        // remove smth
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }

    @Override
    public Element get(int i) {
        return null;
    }

    // Loads the image and prints it afterwards
    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dm() {
        return null;
    }

    @Override
    public ImageContent content() {
        return null;
    }
}
