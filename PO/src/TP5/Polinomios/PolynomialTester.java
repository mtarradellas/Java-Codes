package TP5.Polinomios;

public class PolynomialTester {

    public static void main(String[] args) {
        Polynomial fourthGPol = new Polynomial(4);
        fourthGPol.set(2, 3.1);
        fourthGPol.set(3, 2);
        System.out.println(fourthGPol.eval(2)); //28.4
        System.out.println(new Polynomial(3).eval(5)); //0
        try {
            new Polynomial(-4);
        }catch (InvalidGradeException e) {
            System.out.println(e.getMessage()); //0
        }
        try {
            fourthGPol.set(7, 1.5);
        } catch (InvalidCoefException e) {
            System.out.println(e.getMessage());
        }
    }
}
