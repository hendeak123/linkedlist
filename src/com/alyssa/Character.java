package com.alyssa;

class Character<T> implements ICharacter<T> {

    private T name;
    private int age;
    private ICharacter<T> next;

    public Character(T name, int age) {
        this.name = name;
        this.age = age;
    }

    public ICharacter<T> getNext() {
        return next;
    }

    public ICharacter<T> setNext(ICharacter<T> nextNode) {
        this.next = nextNode;
        return nextNode;
    }

    public String toString() {
        return this.name + ", " + this.age;
    }
}
