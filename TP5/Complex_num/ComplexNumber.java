package TP5.Complex_num;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public ComplexNumber add(Number n) {
        return new ComplexNumber(this.real + n.doubleValue(), 0);
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(this.real + c.getReal(), this.imag + c.getImag());
    }

    @Override
    public String toString(){
        if (imag > 0)
            return String.format("%g + %gi", real, imag);
        return String.format("%g - %gi", real, Math.abs(imag));
    }
}
