package TP6.Funciones;

public class CompositeFunction implements Function {
    Function f;
    Function g;

    public CompositeFunction(Function f, Function g) {
        this.f = f;
        this.g = g;
    }

    @Override
    public double evaluate(double x) {
        return g.evaluate(f.evaluate(x));
    }
}
