package com.kadirgurturk.Flyweight;

public class Character {
    private final char symbol;
    private final String color;
    private final int size;

    public Character(char symbol, String color, int size) {
        this.symbol = symbol;
        this.color = color;
        this.size = size;
    }

    public char getSymbol() {
        return symbol;
    }

    public void render(int positionX, int positionY) {
        System.out.println("Render character '" + symbol + "' at position (" + positionX + ", " + positionY + ") with color: " + color + " and size: " + size);
    }
}

