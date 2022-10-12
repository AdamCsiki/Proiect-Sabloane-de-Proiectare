package org.adamc.entity;

public class Author {
    private long id;
    private String name;
    private int age;

    public Author(String name) {
        this.name = name;
        this.age = 0;
    }

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Author: " + this.name + "\n";
    }
}
