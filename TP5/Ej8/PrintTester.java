package TP5.Ej8;

public class PrintTester {

    public static void main(String[] args) {

        A a = new A();
        a.print(3); //A Integer integer
        a.print(3.14); //A Number double
        a.print((Number)3); //A Number integer
        a.print((Object)3); //A Object integer
        System.out.println();

        A b1 = new B();
        b1.print(3.14); //B Number double
        b1.print("hola"); //A Object string
        b1.print((Number)3); //B number integer
        b1.print((Object)3); //A Object integer
        System.out.println();

        B b2 = new B();
        b2.print(3.14); //B Number double
        b2.print("hola"); //A Object string
        b2.print((Number)3); //B Number Integer
        b2.print((Object)3); //A Object integer

        // b1 y b2 parecen ser equivalentes
    }
}
