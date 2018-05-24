package TP6.List;

import java.util.Iterator;

public class LinearListImp<T> implements LinearList<T> {
    private Node first;
    private int size;


    @Override
    public Iterator<T> iterator() {
        return new LinearListImpIterator();
    }

    @Override
    public void add(T elem) {
        if (first == null) {
            first = new Node(elem, null);
            size++;
            return;
        }
        Node aux = first;
        while (aux.tail != null) {
            aux = aux.tail;
        }
        aux.tail = new Node(elem, null);
        size++;
    }

    private Node goTo(int idx) {
        if (idx<0 || size<idx) throw new RuntimeException("Index out of bounds");
        Node aux = first;
        while (idx != 0) {
            aux = aux.tail;
            idx--;
        }
        return aux;
    }

    @Override
    public T get(int idx) {
        return goTo(idx).elem;
    }

    @Override
    public void set(int idx, T elem) {
        goTo(idx).elem = elem;
    }

    @Override
    public void remove(int idx) {
        if (idx==0) {
            if (first==null) throw new RuntimeException("List Empty");
            first = first.tail;
            size--;
            return;
        }
        Node aux = goTo(idx-1);
        if (aux.tail==null) throw new RuntimeException("Index out of bounds");
        aux.tail = aux.tail.tail;
        size--;
    }

    @Override
    public int indexOf(T elem) {
        Node aux = first;
        int idx = 0;
        while (aux!=null){
            if(aux.elem.equals(elem)) return idx;
            aux = aux.tail;
            idx++;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node aux = first;
        while (aux!=null) {
            s.append(aux.elem).append(" ");
            aux = aux.tail;
        }
        return s.toString();
    }

    private class Node{
        private T elem;
        private Node tail;

        Node(T elem, Node tail) {
            this.elem = elem;
            this.tail = tail;
        }
    }

    private class LinearListImpIterator implements Iterator<T>{
        private Node current;

        LinearListImpIterator() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new RuntimeException("No more elements");
            Node aux = current;
            current = current.tail;
            return aux.elem;
        }
    }
}
