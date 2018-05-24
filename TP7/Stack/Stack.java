package TP7.Stack;

public interface Stack<T> {

    void push(T elem);

    T peek();

    T pop();

    boolean isEmpty();
}
