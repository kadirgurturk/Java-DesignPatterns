package com.kadirgurturk.Prototype.book;

import java.util.HashMap;
import java.util.Map;

public class BookStore {
    private Map<String, Book> books = new HashMap<>();

    public BookStore() {
        loadBooks();
    }

    public void loadBooks() {
        Novel novel = new Novel("Kumarbaz");
        Magazine magazine = new Magazine("Elle");

        books.put("novel", novel);
        books.put("magazine", magazine);
    }

    public Book getBook(String type) {
        return books.get(type).clone();
    }
}
