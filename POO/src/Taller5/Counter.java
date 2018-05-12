package Taller5;

public class Counter {

    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return String.valueOf(count);
    }

    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(o instanceof Counter))
            return false;
        Counter counter = (Counter) o;
        return getCount() == counter.getCount();
    }
}
