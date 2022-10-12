package org.adamc.entity;

public class Image {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Image: " + this.imageName + "/n";
    }
}
