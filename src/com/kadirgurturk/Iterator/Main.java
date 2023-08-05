package com.kadirgurturk.Iterator;

import com.kadirgurturk.Iterator.text.Text;
import com.kadirgurturk.Iterator.text.TextIterator;

public class Main {
    public static void main(String[] args) {
        String content = "Celtics bu sene playoff yapamaz 2023-2024.";
        Text text = new Text(content);
        TextIterator iterator = text.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}