package TP5.Ej8;

public class B extends A{

    public void print(Number n) {
        System.out.println(String.format(MESSAGE, "B", "Number", n.getClass()));
    }
}
