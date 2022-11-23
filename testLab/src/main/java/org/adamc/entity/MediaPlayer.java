package org.adamc.entity;

import org.adamc.interfaces.Element;
import org.adamc.interfaces.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private String title;
    private List<PlayList> list;

    public MediaPlayer(String title) {
        this.title = title;
        this.list = new ArrayList<>();
    }

    public void add(PlayList playList) {
        this.list.add(playList);
    }

    public void accept(Visitor visitor) {
        for(PlayList playList: list) {
            playList.accept(visitor);
        }
    }
}
