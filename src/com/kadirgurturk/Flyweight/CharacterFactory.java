package com.kadirgurturk.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<CharacterKey, Character> characters = new HashMap<>();

    public Character getCharacter(char symbol, String color, int size) {
        CharacterKey key = new CharacterKey(symbol, color, size);
        Character character = characters.get(key);

        if (character == null) {
            character = new Character(symbol, color, size);
            characters.put(key, character);
        }

        return character;
    }
}
