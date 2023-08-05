package com.kadirgurturk.Iterator.text;

public class Text {
    private String[] words;

    public Text(String content) {
        this.words = content.split(" ");
    }

    public TextIterator createIterator() {
        return new ConcreteTextIterator(this);
    }

    public String[] getWords() {
        return words;
    }
}
