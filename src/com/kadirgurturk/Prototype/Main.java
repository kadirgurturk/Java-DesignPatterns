package com.kadirgurturk.Prototype;

import com.kadirgurturk.Prototype.book.Book;
import com.kadirgurturk.Prototype.book.BookStore;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        Book novel = bookStore.getBook("novel");
        Book magazine = bookStore.getBook("magazine");

        System.out.println(novel);
        System.out.println(magazine);
    }
}