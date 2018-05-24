package TP6.Intervalos;

import java.util.Iterator;

public class Interval implements Iterable<Double>{
    private double start;
    private double end;
    private double increment = 1;
    private long size = -1;

    Interval(double start, double end, double increment) {
        if (end <= start)
            throw new MyException("End must be higher than start");
        if(increment <= Double.MIN_VALUE)
            throw new MyException("Increment must be positive");
        this.start = start;
        this.end = end;
        this.increment = increment;
    }

    Interval(double start, double end) {
        if (end <= start)
            throw new MyException("End must be higher than start");
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Double> iterator(){
        return new IntervalIterator();
    }

    public long size() {
        if (size != -1)
            return size;
        return size = calculateSize();
    }

    private long calculateSize() {
        double aux = this.start;
        long i = 0;
        for( ; aux <= this.end; i++) {
            aux += increment;
        }
        return i;
    }

    public double at(long idx) {
        if(idx <= 0)
            throw new MyException("Index must be positive");
        if(size == -1)
            size = calculateSize();
        if(idx > size)
            throw new MyException(String.format("Index %d is out of range (max index: %d)", idx, size));
        return start + (idx-1)*increment;
    }

    public long indexOf(double value) {
        if (value < start || end < value)
            return 0;
        double aux = start;
        for (long i = 1; aux <= end; i++) {
            if (aux > value)
                return 0;
            if (aux == value)
                return i;
            aux += increment;
        }
        return 0;
    }

    public boolean includes(double value) {
        long idx = indexOf(value);
        return idx!=0;
    }

    @Override
    public String toString() {
        return String.format("[%g , %g]", start, end);
    }

    @Override
    public boolean equals(Object other) {
        if(other == this)
            return true;
        if( !(other instanceof Interval))
            return false;
        Interval aux = (Interval) other;
        if( start == aux.start ) {
            if( end == aux.end ){
                return increment == aux.increment;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 11;
        long aux1 = Double.doubleToLongBits(start);
        long aux2 = Double.doubleToLongBits(end);
        long aux3 = Double.doubleToLongBits(increment);
        result = 31 * result + (int) (aux1 ^ (aux1 >>> 32));
        result = 31 * result + (int) (aux2 ^ (aux2 >>> 32));
        result = 31 * result + (int) (aux3 ^ (aux3 >>> 32));
        return result;
    }

    private class IntervalIterator implements Iterator<Double>{
        private Double current;

        IntervalIterator() {
            current = start;
        }

        @Override
        public boolean hasNext() {
            return current<=end;
        }

        @Override
        public Double next() {
            if (!hasNext()) throw new RuntimeException("nope");
            Double aux = current;
            current = current + increment;
            return aux;
        }
    }

}
