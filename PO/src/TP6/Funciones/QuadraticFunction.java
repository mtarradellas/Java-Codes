package TP6.Funciones;

public class QuadraticFunction extends LinearFunction {
    private double a;

    public QuadraticFunction(double a, double m, double b) {
        super(m, b);
        this.a = a;
    }

    @Override
    public double evaluate(double x) {
        return super.evaluate(x) + (this.a * Math.pow(x, 2));
    }
}
