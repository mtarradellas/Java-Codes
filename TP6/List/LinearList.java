package TP6.List;

public interface LinearList<T> extends Iterable<T>{

    void add(T elem);

    T get(int idx);

    void set(int idx, T elem);

    void remove(int idx);

    int indexOf(T elem);

    int size();
}
