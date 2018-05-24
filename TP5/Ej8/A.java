package TP5.Ej8;

public class A {
    static final String MESSAGE = "%s  %s  %s";

    public void print(Object o) {
        System.out.println(String.format(MESSAGE, "A", "Object", o.getClass()));
    }

    public void print(Number n) {
        System.out.println(String.format(MESSAGE, "A", "Number", n.getClass()));
    }

    public void print(Integer i) {
        System.out.println(String.format(MESSAGE, "A", "Integer", i.getClass()));
    }
}
