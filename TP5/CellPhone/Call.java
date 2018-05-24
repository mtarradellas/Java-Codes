package TP5.CellPhone;

public class Call {
    private static final double COST_PER_SECOND = 0.01;
    private String from, to;
    private double duration;

    public Call(String from, String to, double duration) {
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public double cost() {
        return this.duration * COST_PER_SECOND;
    }

    public String getTo() {
        return to;
    }
}
