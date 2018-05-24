package TP5.Polinomios;

public class Polynomial {
    private int grade;
    private double pol[];

    public Polynomial(int grade) {
        if(grade < 0)
            throw new InvalidGradeException("Invalid grade");
        this.grade = grade;
        pol = new double[grade+1];
    }

    public void set(int coef, double value) {
        if (coef<0 || coef>grade)
            throw new InvalidCoefException("Invalid coeficient");
        pol[coef] = value;
    }

    public double eval(double value) {
        double result = 0;
        for (int i = 0; i<grade; i++) {
            result += (pol[i]*(Math.pow(value,(double)i)));
        }
        return result;
    }
}
