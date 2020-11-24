package com.alyssa;

public interface IList<T> {

    void initializeList(T name, int age);

    ICharacter<T> getHead();

    void append(T name, int age);

    void removeLast();
}
