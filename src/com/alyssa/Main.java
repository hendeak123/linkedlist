package com.alyssa;

public class Main {

    public static void main(String[] args) {
        IList<String> character = new List<String>();

        character.initializeList("Edelgard", 18);
        character.append("Hubert", 21);
        character.removeLast();

        ICharacter<String> starter = character.getHead();
        while (starter != null) {
            System.out.println(starter);
            starter = starter.getNext();
        }
    }
}

