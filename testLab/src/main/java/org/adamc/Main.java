package org.adamc;

import org.adamc.entity.*;
import org.adamc.interfaces.Visitor;

public class Main {
    public static void main(String[] args) {
        MediaPlayer m = new MediaPlayer("Winamp");
        PlayList p = new PlayList("Chill");
        p.add(new Song("BudaBar", 3000));
        p.add(new Video("Waves in Caraibe", 2000));
        p.add(new Song("Simple things", 5000));
        p.add(new Gif("sunglasses", 500));

        m.add(p);

        Visitor v = new MediaSizeVisitor();
        m.accept(v);
        v.printSizes();
    }
}