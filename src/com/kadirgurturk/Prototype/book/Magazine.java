package com.kadirgurturk.Prototype.book;

public class Magazine implements Book{

    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public Book clone() {
        return new Magazine(this.title);
    }

    @Override
    public String toString() {
        return "Magazine: " + title;
    }
}
