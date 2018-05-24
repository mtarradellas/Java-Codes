package TP5.Complex_num;

public class MainComplexNumber {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 5);
        ComplexNumber c2 = new ComplexNumber(4, 4);
        ComplexNumber c3 = new ComplexNumber(-5, -2);
        ComplexNumber c4 = c1.add(c2);
        ComplexNumber c5 = c2.add(c3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
