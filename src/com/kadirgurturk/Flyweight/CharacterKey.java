package com.kadirgurturk.Flyweight;

public class CharacterKey {

    private final char symbol;
    private final String color;
    private final int size;

    public CharacterKey(char symbol, String color, int size) {
        this.symbol = symbol;
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CharacterKey other = (CharacterKey) obj;
        return symbol == other.symbol && color.equals(other.color) && size == other.size;
    }
}

