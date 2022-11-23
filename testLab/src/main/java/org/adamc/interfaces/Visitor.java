package org.adamc.interfaces;

import org.adamc.entity.*;

public interface Visitor {
    void visitPlayList(PlayList playList);
    void visitGif(Gif gif);
    void visitSong(Song song);
    void visitVideo(Video video);

    void printSizes();
}
