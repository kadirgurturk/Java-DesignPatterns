package com.kadirgurturk.Prototype.book;

public class Novel implements Book {

    private String title;

    public Novel(String title) {
        this.title = title;
    }

    public Book clone() {
        return new Novel(this.title);
    }

    @Override
    public String toString() {
        return "Novel: " + title;
    }
}
