package org.adamc.entity;

import org.adamc.factory.ImageLoaderFactory;
import org.adamc.interfaces.Element;
import org.adamc.interfaces.Picture;
import org.adamc.interfaces.Visitor;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String url;
    private ImageContent content;

    public Image(String url) {
//        this.url = url;
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
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
        visitor.visitImage(this);
    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Image: " + this.url);
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
        return new ImageLoaderFactory().create(url);
    }
}
