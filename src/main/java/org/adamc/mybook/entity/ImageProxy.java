package org.adamc.mybook.entity;

import org.adamc.mybook.repository.Element;
import org.adamc.mybook.repository.Picture;
import org.adamc.mybook.repository.Visitor;

import java.awt.*;

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
