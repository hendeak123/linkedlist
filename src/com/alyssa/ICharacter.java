package com.alyssa;

public interface ICharacter<T> {

    ICharacter<T> getNext();

    ICharacter<T> setNext(ICharacter<T> nextNode);
}
