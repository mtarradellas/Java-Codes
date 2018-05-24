package TP6.Intervalos;

public class IntervalTester {
    public static void main(String[] args) {

        Interval interval = new Interval(-1, 1, 0.5);
        try {
            System.out.println(interval);
            System.out.println(interval.size());
            System.out.println(interval.at(3));
            System.out.println(interval.indexOf(0.5));
            System.out.println(interval.includes(0.5));
            System.out.println(interval.equals(new Interval(-1, 1, 0.5)));
            System.out.println(interval.hashCode() == new Interval(-1, 1,
                    0.5).hashCode());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        for (Double d: interval) {
            System.out.print(d + " ");
        }
    }
}
