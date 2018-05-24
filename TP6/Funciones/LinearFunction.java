package TP6.Funciones;

public class LinearFunction implements Function {
    private double m;
    private double b;

    public LinearFunction(double m, double b) {
        this.m = m;
        this.b = b;
    }

    @Override
    public double evaluate(double x) {
        return (m*x) + b;
    }

}
