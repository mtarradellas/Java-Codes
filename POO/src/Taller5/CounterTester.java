package Taller5;

public class CounterTester {

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println(myCounter.getCount()); // Imprime 0
        myCounter.increment(); //Aumenta en 1
        myCounter.increment();
        System.out.println(myCounter.getCount()); // Imprime 2
        myCounter.decrement(); // Disminuye en 1
        System.out.println(myCounter.getCount()); //Imprime 1

        myCounter.setCount(10); //Setea el contador
        myCounter.increment();
        System.out.println(myCounter.getCount()); // Imprime 11
        System.out.println(myCounter); // Imprime Counter@60e53b93
    }
}
