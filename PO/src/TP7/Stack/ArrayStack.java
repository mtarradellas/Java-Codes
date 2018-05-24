package TP7.Stack;

import java.util.Arrays;

public class ArrayStack<T> implements AccessStack<T> {
    private T[] elements;
    private static final int INITIAL_DIM = 10;
    private int dim;
    private int space;
    private int popsies;
    private int pushies;

    @SuppressWarnings("unchecked")
    ArrayStack() {
        elements = (T[]) new Object[INITIAL_DIM];
        space = INITIAL_DIM;
    }

    public int getPopsies() {
        return popsies;
    }

    public int getPushies() {
        return pushies;
    }

    @Override
    public void push(T elem) {
        if (dim==space)
            elements = Arrays.copyOf(elements, space + INITIAL_DIM);
        elements[dim++] = elem;
        pushies++;
    }

    @Override
    public T peek() {
        if (dim==0) return null;
        return elements[dim-1];
    }

    @Override
    public T pop() {
        if (dim==0) return null;
        popsies++;
        return elements[--dim];
    }

    @Override
    public boolean isEmpty() {
        return dim==0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = dim-1 ; i>=0 ; i--) {
            s.append(elements[i].toString());
            if (i!=0) s.append(", ");
        }
        s.append("]");
        return s.toString();
    }
}
