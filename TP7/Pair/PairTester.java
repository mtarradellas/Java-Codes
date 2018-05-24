package TP7.Pair;

import java.util.Arrays;
import java.util.Comparator;

public class PairTester {

    public static void main(String[] args) {
        Pair<String, Double> stringDoublePair = new Pair<>("hi", 0.14);
        System.out.println(stringDoublePair);
        Pair<Integer, Integer> integerIntegerPair = new Pair<>(12, 13);
        System.out.println(integerIntegerPair);
        System.out.println(stringDoublePair.equals(new Pair<>("hi", 0.14)));
        System.out.println();

        Integer intArray[] = new Integer[]{7, 3, 1, 5, 9};
        Arrays.sort(intArray);
        arrayPrinter(intArray);
        System.out.println();

        Pair<String, String> stringPair1 = new Pair<>("hola", "mundo");
        Pair<String, String> stringPair2 = new Pair<>("hola", "adiós");
        Pair<String, String> stringPair3 = new Pair<>("buen", "día");
        Pair pairArray[] = new Pair[]{stringPair1, stringPair2, stringPair3};
        Arrays.sort(pairArray, ((o1, o2) -> o2.compareTo(o1)));
        arrayPrinter(pairArray);
        System.out.println();

        Arrays.sort(intArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        arrayPrinter(intArray);

        Arrays.sort(intArray, (o1, o2) -> o2.compareTo(o1));
        arrayPrinter(intArray);


    }
    public static <T> void arrayPrinter(T[] array) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        System.out.println(stringBuilder.toString());
    }

}

