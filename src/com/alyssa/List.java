package com.alyssa;

public class List<T> implements IList<T> {

    private ICharacter<T> head;

    public void initializeList(T name, int age) {
        if (head == null) {
            head = new Character(name, age);
        }
    }

    public ICharacter<T> getHead() {
        return this.head;
    }

    public void append(T name, int age) {
        Character<T> newCharacter = new Character<T>(name, age);
        if (head == null) {
            head = newCharacter;
        }
        ICharacter<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newCharacter);
    }

    public void removeLast() {
        ICharacter<T> currentNode = head;
        ICharacter<T> previousNode = null;
        ICharacter<T> nextNode = null;
        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            nextNode = currentNode.getNext();
            if (nextNode.getNext() == null) {
                previousNode.setNext(null);
            }
        }
        currentNode.setNext(null);
        currentNode = null;
    }
}
