public class MultipleCounterTester {

    public static void main(String[] args) {
        Counter myDoubleCounter = new MultipleCounter(2);
        System.out.println(myDoubleCounter); //Imprime 0
        myDoubleCounter.increment(); //Aumenta en 2
        myDoubleCounter.increment();
        System.out.println(myDoubleCounter); //Imprime 4
        myDoubleCounter.decrement(); //Disminuye en 2
        System.out.println(myDoubleCounter); //Imprime 2
        myDoubleCounter.setCount(10);
        myDoubleCounter.increment();
        System.out.println(myDoubleCounter); //Imprime 12
    }

}