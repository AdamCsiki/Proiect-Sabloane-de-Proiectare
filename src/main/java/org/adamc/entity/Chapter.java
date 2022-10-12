package org.adamc.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name, ArrayList<SubChapter> subChapters) {
        this.name = name;
        this.subChapters = subChapters;
    }

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(ArrayList<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        this.subChapters.add(subChapter);

        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return this.subChapters.get(indexSubChapterOneOne);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Chapter: " + this.name + "\n\t" +
                "SubChapters: \n\t\t" + this.subChapters.stream().map(SubChapter::toString).collect(Collectors.joining());
    }
}
