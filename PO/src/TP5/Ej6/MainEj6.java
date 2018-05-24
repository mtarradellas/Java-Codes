package TP5.Ej6;

public class MainEj6 {

    public static void main(String[] args) {

        ClassA a = new ClassB();
        a.method(3);
        ClassB b = new ClassB();
        b.method(3);
        b.method((Number) 3);
        a = (ClassA) b;
        a.method(3);

    }
}
