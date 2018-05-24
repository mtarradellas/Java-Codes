package TP5.CellPhone;

import java.util.function.BinaryOperator;

public class CellPhoneBill {
    protected String number;
    protected Call[] calls;
    protected static final int BLOCK = 5;
    protected int dim;

    public CellPhoneBill(String number) {
        this.number = number;
        calls = new Call[BLOCK];
        dim = 0;
    }

    public void registerCall(String to, double duration) {
        addCall(new Call(number, to, duration));
    }

    protected void addCall(Call call) {
        if (dim == calls.length){
            resize();
        }
        calls[dim++] = call;
    }

    protected void resize() {
        Call[] aux = new Call[dim + BLOCK];
        System.arraycopy(calls, 0, aux, 0, calls.length);
        calls = aux;
    }

    public double processBill() {
        double bill = 0;
        for(int i = 0; i<dim; i++){
            bill += calls[i].cost();
        }
        return bill;
    }

}
