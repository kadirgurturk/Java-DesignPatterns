package com.kadirgurturk.Flyweight;

public class App {
    public static void main(String[] args) {

        CharacterFactory characterFactory = new CharacterFactory();

        Character characterA1 = characterFactory.getCharacter('A', "Red", 12);
        characterA1.render(10, 20);

        Character characterB1 = characterFactory.getCharacter('B', "Blue", 14);
        characterB1.render(15, 25);

        Character characterA2 = characterFactory.getCharacter('A', "Red", 12);
        characterA2.render(30, 40);

    }
}
