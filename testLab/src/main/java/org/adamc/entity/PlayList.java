package org.adamc.entity;

import org.adamc.interfaces.Element;
import org.adamc.interfaces.Visitor;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements Element {
    private String title;
    private List<Element> mediaList;

    public PlayList(String title) {
        this.title = title;
        this.mediaList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getMediaList() {
        return mediaList;
    }

    @Override
    public Element add(Element element) {
        mediaList.add(element);
        return this;
    }

    @Override
    public void remove(int i) {
        mediaList.remove(i);
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element element: mediaList) {
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPlayList(this);

        for(Element element : mediaList) {
            element.accept(visitor);
        }
    }

    @Override
    public Element get(int i) {
        return mediaList.get(i);
    }
}
