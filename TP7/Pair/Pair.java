package TP7.Pair;

public class Pair
        <A extends Comparable<? super A>, B extends Comparable<? super B>>
        implements Comparable<Pair<A, B>>{

    private A a;
    private B b;

    Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public int compareTo(Pair<A, B> o) {
        int aDiff = a.compareTo(o.a);
        if (aDiff!=0) return aDiff;
        return b.compareTo(o.b);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Pair)) return false;
        Pair aux = (Pair) o;
        if (aux.a.equals(a))
            return aux.b.equals(b);
        return false;
    }
    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }
}
