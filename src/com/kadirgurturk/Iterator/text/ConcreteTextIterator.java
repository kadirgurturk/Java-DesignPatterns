package com.kadirgurturk.Iterator.text;

public class ConcreteTextIterator implements TextIterator {
    private Text text;
    private int index;

    public ConcreteTextIterator(Text text) {
        this.text = text;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < text.getWords().length;
    }

    public String next() {
        if (hasNext()) {
            String word = text.getWords()[index];
            index++;
            return word;
        }
        return null;
    }
}
