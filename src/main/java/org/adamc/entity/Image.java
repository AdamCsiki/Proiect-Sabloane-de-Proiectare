package org.adamc.entity;

import org.adamc.factory.ImageLoaderFactory;
import org.adamc.repository.Element;
import org.adamc.repository.Picture;
import org.adamc.repository.Visitor;

import java.awt.*;

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
        System.out.println("\t (img)" + this.url);
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
