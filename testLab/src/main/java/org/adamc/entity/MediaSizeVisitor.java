package org.adamc.entity;

import org.adamc.interfaces.Visitor;

import java.util.HashMap;

public class MediaSizeVisitor implements Visitor {
    private HashMap<String, Integer> sizes;
    private String currentPlayList;
    private int totalSize;
    private int currentSize;

    public MediaSizeVisitor() {
        this.sizes = new HashMap<>();
        this.currentPlayList = "";
        this.totalSize = 0;
        this.currentSize = 0;
    }

    @Override
    public void printSizes() {
        System.out.printf("Total size: %d kb\n", totalSize);
        System.out.println("Playlists sizes:");
        sizes.forEach((key, value) -> {
            System.out.printf("\t%s --- %d kb", key, value);
        });
    }

    @Override
    public void visitPlayList(PlayList playList) {
        currentPlayList = playList.getTitle();
        sizes.put(currentPlayList, 0);
    }

    @Override
    public void visitGif(Gif gif) {
        sizes.put(currentPlayList, sizes.get(currentPlayList) + gif.getSize());
        totalSize += gif.getSize();
    }

    @Override
    public void visitSong(Song song) {
        sizes.put(currentPlayList, sizes.get(currentPlayList) + song.getSize());
        totalSize += song.getSize();
    }

    @Override
    public void visitVideo(Video video) {
        sizes.put(currentPlayList, sizes.get(currentPlayList) + video.getSize());
        totalSize += video.getSize();
    }
}
